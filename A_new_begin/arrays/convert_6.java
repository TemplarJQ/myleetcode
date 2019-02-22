class Solution {
    public String convert(String s, int numRows) {
        //一个基本想法就是按照填充方法在一个char矩阵中填充字母，然后再收集输出即可。
        
        //但是发现规律，是在每个小区间内一点一点向内部集中的，小区间的划分是长度为2*numRows-2
        //直接构造一个矩阵存入每一行即可访问
        int len = s.length();
        int col = 2 * numRows - 2;
        int row = 0;
        if(col==0){return s;}
        //讨论一种col<len的条件
        if(len%col==0){
            row = len/col;
        }else{
            row = len/col + 1;
        }
        char[][] cut  = new char[row][col];
        //构建矩阵
        int step = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(step >= len){
                    cut[i][j] = '0';
                }else{
                    cut[i][j] = s.charAt(step++);
                }
                
            }
        }
        //构建字符串，加快速度也可以用数组，因为字符串长度是一样的。
        //StringBuilder res = new StringBuilder();
        char[] res = new char[len];
        int cnt = 0;
        int m = 0, n = col;
        while(m<=n){
            for(int i=0;i<row;i++){
                if(cut[i][m]!='0'){
                    //res.append(cut[i][m]);
                    res[cnt++] = cut[i][m];
                }
                if(n<col&&cut[i][n]!='0'&m!=n){
                    //res.append(cut[i][n]);
                    res[cnt++] = cut[i][n];
                }
            }
            m++;
            n--;
        }
        //return res.toString();
        return new String(res);
    }
}
