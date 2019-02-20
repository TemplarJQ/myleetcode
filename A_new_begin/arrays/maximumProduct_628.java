class Solution {
    public int maximumProduct(int[] nums) {
        //首先一个想法就是直接排序，然后无非就是两负一正，要不就是全正
        int len = nums.length;
        Arrays.sort(nums);
        if(len==3){return nums[0]*nums[1]*nums[2];}
        int pos = nums[len-1]*nums[len-2]*nums[len-3];
        if(nums[0]<0&&nums[1]<0){
            int neg = nums[0]*nums[1]*nums[len-1];
            return Math.max(neg,pos);
        }
        return pos;
        
        //更快的方法思路是一样的
        // Arrays.sort(nums);
        // int max1 = nums[nums.length - 1];
        // int max2 = nums[nums.length - 2];
        // int max3 = nums[nums.length - 3];
        // int min1 = nums[0];
        // int min2 = nums[1];
        // return Math.max(max1 * max2 * max3, max1 * min1 * min2);
    }
}
