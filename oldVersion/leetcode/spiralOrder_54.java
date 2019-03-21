package leetcode;

import java.util.ArrayList;
import java.util.List;

public class spiralOrder_54 {
	public List<Integer> getline(int[][] matrix) {
		List<Integer> res = new ArrayList<>();
        int rowStart = 0, colStart = 0;
        int rowEnd = matrix.length-1;
        int colEnd = matrix[0].length-1;
        System.out.println("rowS:"+rowStart+"rowE:"+rowEnd+"colS:"+colStart+"colE:"+colEnd);
        int step = 0;
        int size = (rowEnd+1)*(colEnd+1);
        while(step<size){
            if(rowStart<=rowEnd&&colStart<=colEnd){
                for(int i=colStart;i<=colEnd;i++){
                	res.add(matrix[rowStart][i]);
                	step++;
                	System.out.println("step1:"+step);
                }
                for(int i=rowStart;i<=rowEnd;i++){
                    res.add(matrix[i][colEnd]);
                    step++;
                    System.out.println("step2:"+step);
                }
                colEnd--;rowStart++;
                System.out.println("colE"+colEnd+"rowS:"+rowStart);
            }
            if(rowStart<=rowEnd&&colStart<=colEnd){
                for(int i=colEnd;i>=colStart;i--){
                	res.add(matrix[rowEnd][i]);
                	step++;
                	System.out.println("step3:"+step);
                }
                for(int i=rowEnd;i>=rowStart;i--){
                    res.add(matrix[i][colStart]);
                    step++;
                    System.out.println("step4:"+step);
                }
                rowEnd--;colStart++;
                System.out.println("rowE:"+rowEnd+"colS:"+colStart);
            }
        }
        return res;
	}

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		spiralOrder_54 tt = new spiralOrder_54();
		List<Integer> list = tt.getline(matrix);
		for(Integer i:list) {
			System.out.print(i+"-");
		}
 	}
}
