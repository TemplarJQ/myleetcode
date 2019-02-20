class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //最快的方法是HashMap直接遍历即可
        int a = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer val = map.get(nums[i]);
            if (val != null && (i - val <= k)) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
        
        //遍历
        // int len = nums.length;
        // for(int i=0;i<len-1;i++){
        //     for(int j=i+1;j<len;j++){
        //         if((j-i)>k){break;}
        //         if(nums[i]==nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;
    }
}
