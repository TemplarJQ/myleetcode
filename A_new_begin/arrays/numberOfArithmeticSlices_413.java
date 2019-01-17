class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        //发现的一个规律就是找出最长的等差数列，然后3为最小单位划分即可。
        //然后找到最长的长度，与3做差，然后加一，这个值一直递减累加，结果就是和。
        //先找到最大长度
        int len = A.length;
        int max = 0;
        int sub = 0;
        int res = 0;
        for(int i=0;i<len-2;i++){
            if(A[i]-A[i+1]==A[i+1]-A[i+2]){
                sub++;
            }else{
                if(sub>0){
                    sub += 2;
                    res = count(res,sub);
                    sub = 0;
                }
            }
            if(i==len-3&&sub>0){
                sub += 2;
                res = count(res,sub);
                sub = 0;
            }
        }
        return res;
    }
    
    public int count(int val, int max){
        int cnt = max - 3 + 1;
        int res = 0;
        while(cnt>0){
            res += cnt;
            cnt--;
        }
        return res+val;
    }
}
