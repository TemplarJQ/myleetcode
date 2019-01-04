class Solution {
    public int findMin(int[] nums) {
        
        //标准答案
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[end]) start = mid + 1;
            else end = mid;
        }
        return nums[start];
        
        //提示二暗示找一个O(logN)复杂度的算法
        //注意，二分法不是回溯算法，不一定需要递归，混淆了！
        //注意，二分法一个重要标志是left和right指针，它们和mid指针交替
        //然而时间效率并没有提升
            
        // int len = nums.length;
        // int left = 0, right = len-1, mid = 0;
        // if(nums[left]<nums[right]){return nums[left];}
        // while(left + 1 < right){
        //     mid = (left + right) / 2;
        //     if(nums[0]<nums[mid]){
        //         left = mid;
        //     }else{
        //         right = mid;
        //     }
        // }
        // return nums[right];
        
        //错误的思考
        // if(nums[mid]>nums[0]){
        //     res = nums[0];
        // }else{
        //     for(int i=0;i<mid;i++){
        //         if(nums[i]<nums[i+1]){
        //             return nums[i+1];
        //         }
        //     }
        // }
        // if(nums[mid]<nums[len-1]){
        //     res = Math.max(nums[mid],res);
        // }else{
        //     for(int i=mid;i<len-1;i++){
        //         if(nums[i]<nums[i+1]){
        //             return nums[i];
        //         }
        //     }
        // }
        
        //看了提示一，找小的，这就已经击败73%了
        // int len = nums.length;
        // if(len==0){return 0;}
        // if(len==1){return nums[0];}
        // for(int i=0;i<len-1;i++){
        //     if(nums[i]>nums[i+1]){
        //         return nums[i+1];
        //     }
        // }
        // return nums[0];
        
        
        //想试试直接排序会不会超时
        // Arrays.sort(nums);
        // return nums[0];
        //不会超时，但是果然很慢
    }
}
