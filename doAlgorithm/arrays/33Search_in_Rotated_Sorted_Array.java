class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int head = 0;
        int tail = len - 1;
        int mid = head;
        //分成两部分，一部分有序，一部分无序
        while(nums[head]>=nums[tail]){
            if(head + 1 == tail){
                if(target==nums[head]){return head;}
                if(target==nums[tail]){return tail;}
                return -1;
            }
            mid = (head + tail) / 2;
            if(target<nums[head] && target>nums[tail]){
                return -1;
            }if(target>=nums[head] && target <= nums[mid]){
                tail = mid;
            }else if(target<=nums[mid] && target <= nums[tail]){
                head = mid;
            }
        }
        return nums[mid];
        
        //这个题居然是用线性做的？？
        // int l = nums.length;
        // if (l == 0)
        //     return false;
        // if (l == 1) {
        //     if (target == nums[0])
        //         return true;
        //     return false;
        // }
        // int st = 0, ed = l - 1;
        // while (st < ed) {
        //     if (nums[st] == target || nums[ed] == target)
        //         return true;
        //     if (nums[ed] < target && nums[st] > target)
        //         return false;
        //     if (nums[ed] < target) {
        //         st++;
        //     } else {
        //         ed--;
        //     }
        // }
        // return false;
        
    }
}
