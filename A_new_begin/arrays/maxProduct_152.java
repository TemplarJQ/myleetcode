class Solution {
    public int maxProduct(int[] nums) {
        //第一感觉是动规
        //重现高赞方法：实际上就是很简单，保存一个最大值一个最小值，负数会将最值翻折，每次把当前值nums[i]与乘积比较，如果为当前值相当于max清零从当前开始，否则累乘计入
        //这个算法表现非常好
        int res = Integer.MIN_VALUE, max = 1, min = 1;//初始化必须为1，不能为nums[0]
        int len = nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]<0){
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(max*nums[i],nums[i]);
            min = Math.min(min*nums[i],nums[i]);
            res = Math.max(max, res);
        }
        return res;
        
        //先把所有可能遍历一次，时间复杂度是n^2，果然效果非常差，仅仅4%
        // int len = nums.length;
        // int max = nums[0];
        // if(len==1){return nums[0];}
        // for(int i=0;i<len-1;i++){
        //     if(nums[i]>max){
        //         max = nums[i];
        //     }
        //     int plus = nums[i];
        //     for(int j=i+1;j<len;j++){
        //         plus *= nums[j];
        //         if(plus>max){
        //             max = plus;
        //         }
        //     }
        // }
        // return Math.max(nums[len-1],max);
    }
}
