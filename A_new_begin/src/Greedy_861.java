/**
 * @author: lblade
 * @Date: Created in 6:19 PM 2019/1/5
 */
class Greedy_861 {
    public int matrixScore(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        //先遍历行，首位不为1则整行移动
        for(int r=0;r<row;r++){
            if(A[r][0]==0){
                changeRow(A,col,r);
            }
        }
        //载遍历列，如果1的个数于0的个数，则整列移动

        for(int c=0;c<col;c++){
            int cnt = 0;
            for(int r=0;r<row;r++){
                if(A[r][c]==1){
                    cnt++;
                }
            }
            if(cnt<=(row>>1)){
                changeCol(A,row,c);
            }
        }

        int plus = 1;
        int res = 0;
        for(int c=col-1;c>=0;c--){
            int cnt = 0;
            for(int r=0;r<row;r++){
                if(A[r][c]==1){
                    cnt++;
                }
            }
            res += cnt*plus;
            plus *= 2;
        }

        return res;
    }

    public void changeRow(int[][] A,int col, int rowNum){
        for(int i=0;i<col;i++){
            if(A[rowNum][i]==0){
                A[rowNum][i]=1;
            }else{
                A[rowNum][i]=0;
            }
        }
    }

    public void changeCol(int[][] A, int row, int colNum){
        for(int i=0;i<row;i++){
            if(A[i][colNum]==0){
                A[i][colNum]=1;
            }else{
                A[i][colNum]=0;
            }
        }
    }
}
