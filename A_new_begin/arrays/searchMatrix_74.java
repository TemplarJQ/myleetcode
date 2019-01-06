class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //剑指offer，面试题四，这个题目用到的方法就是从右上角不断地搜索，大于target，则整列都没用，小于target则整行都没用。
        
        //还是大佬的方法，最快就是6ms了，可能直接遍历和右上角缩减法是因为样例的问题
        int m=matrix.length;
        if(m==0) return false;
        
        int n=matrix[0].length;
        if(n==0) return false;
        
        if(matrix[0][0]>target) return false;
        
        int i=0;
        for(i=0;i<m;i++){
            if(matrix[i][0]>target){
                break;
            }
        }
        
        i=i-1;    //在这一行找
        
        int low =0;
        int height = n-1;
        int mid=0;
        
        while(low<=height){
            mid = (low+height)/2;
            if(matrix[i][mid]==target){
                return true;
            }else if(matrix[i][mid]<target){
                low = mid+1;
            }else{
                height = mid-1;
            }
        }
        
        return false;
        
        
        //大佬的方法，右上角比较，也没有快很多
        // if(matrix.length == 0)
        //     return false;
        // int row = 0, col = matrix[0].length-1;
        // while(row < matrix.length && col >= 0){
        //     if(matrix[row][col] < target)
        //         row++;
        //     else if(matrix[row][col] > target)
        //         col--;
        //     else
        //         return true;
        // }
        // return false;
        
        //woc这个优势方法居然比直接遍历还慢
        // int row = matrix.length;
        // if(row==0){return false;}
        // int col = matrix[0].length;
        // int rowNum = 0;
        // int colNum = col-1;
        // while(rowNum<row&&colNum>=0){
        //     if(matrix[rowNum][colNum]==target){
        //         return true;
        //     }
        //     if(matrix[rowNum][colNum]>target){
        //         colNum--;
        //     }
        //     if(rowNum==row||colNum<0){break;}
        //     if(matrix[rowNum][colNum]<target){
        //         rowNum++;
        //     }
        // }
        // return false;
        
        
        
        //先看下遍历,11ms，都能击败64%？也好意思叫中等题。。。
        // int row = matrix.length;
        // if(row==0){return false;}
        // int col = matrix[0].length;
        // for(int i=0;i<row;i++){
        //     for(int j=0;j<col;j++){
        //         if(matrix[i][j]==target){
        //             return true;
        //         } 
        //     }
        // }
        // return false;
        
        
    }
}
