package leetcode;

public class matrix_867 {
	public int[][] turn(int[][] A) {
		int row = A.length;
		int col = A[0].length;
		int[][] res = new int[col][row];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				res[j][i] = A[i][j];
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
		matrix_867 tt = new matrix_867();
		System.out.println(tt.turn(A));
	}
}
