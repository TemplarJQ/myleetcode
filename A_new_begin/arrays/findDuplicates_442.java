class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        //这个题是剑指上数组第二题的一个搜索结果，随便写写，其实用不到那种置换方法。
        
        
        
        
        //额外空间,这个就很快了。13ms。
        //俩合在一起更快，达到了9ms。
        //最快的果然和我的是一样的。
        List<Integer> res = new ArrayList<>();
        int len = nums.length;
        int[] flag = new int[len+1];
        for(int i=0;i<len;i++){
            flag[nums[i]]++;
            if(flag[nums[i]]>1){
                res.add(nums[i]);
            }
        }
        // for(int i=0;i<len+1;i++){
        //     if(flag[i]>1){
        //         res.add(i);
        //     }
        // }
        return res;
        
        //试试下标与数字对应这个技巧
        //这个是没通过的，因为会有一个数字等于len
        // List<Integer> res = new ArrayList<>();
        // int len = nums.length;
        // if(len==2){res.add(nums[0]);return res;}
        // for(int i=0;i<len;i++){
        //     if(nums[i]>=len){continue;}
        //     if(nums[i]!=i){
        //         if(nums[i]==nums[nums[i]]){
        //             res.add(nums[i]);
        //         }
        //         else{
        //             int temp = 0;
        //             temp = nums[i];
        //             nums[i] = nums[nums[i]];
        //             nums[temp] = temp;
        //         }
        //     }
        // }
        // return res;
        
        
        //试试其他方法,比如说排序。54ms。
        // Arrays.sort(nums);
        // int len = nums.length;
        // List<Integer> res = new ArrayList<>();
        // for(int i=0;i<len - 1;i++){
        //     if(nums[i]==nums[i+1]){
        //         res.add(nums[i]);
        //     }
        // }
        // return res;
        
        //如果用map记录一下的话直接就知道结果了，很简单。但是时间很长,93ms。
        // Map<Integer,Integer> map = new HashMap<>();
        // int len = nums.length;
        // for(int i=0;i<len;i++){
        //     if(map.containsKey(nums[i])){
        //         map.put(nums[i],map.get(nums[i])+1);
        //     }else{
        //         map.put(nums[i],1);
        //     }
        // }
        // List<Integer> res = new ArrayList<>();
        // for(Integer val:map.keySet()){
        //     if(map.get(val)>1){
        //         res.add(val);
        //     }
        // }
        // return res;
    }
}
