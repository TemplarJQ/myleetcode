class Solution {
    public int singleNumber(int[] nums) {
        //先排序是一个正常想法
        int len = nums.length;
        if(len==1){return nums[0];}
        if(len<03){return 0;}
        Arrays.sort(nums);
        int i = 0;
        while(i<len){
            if(i+1>=len){
                break;
            }
            if(nums[i]==nums[i + 1]){
                if(i+3<len){
                    i = i + 3;
                }else{
                    return 0;
                }
            }else{
                break;
            }
        }
        return nums[i];
    }
}
