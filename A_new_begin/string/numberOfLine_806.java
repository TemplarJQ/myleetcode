class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int len = S.length();
        int cnt = 0,num = 0;
        int res = 0;
        for(int i=0;i<len;i++){
            num = widths[S.charAt(i) - 'a'];
            if((cnt + num) <= 100){
                cnt += num;
            }else{
                cnt = num;
                res++;
            }
        }
        if(cnt!=0){
            res++;
        }
        int[] re = {res, cnt};
        return re;
    }
}
