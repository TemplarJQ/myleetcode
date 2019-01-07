class Solution {
    public String[] findRelativeRanks(int[] nums) {
        
        //有点优先队列的意思，但是可以先用其他方法做，比如map
        Map<Integer, String> map = new HashMap<>();
        int len = nums.length;
        int cnt = len;
        int[] sortRes = nums.clone();
        String[] res = new String[len];
        Arrays.sort(sortRes);
        for(int i=0;i<len;i++){
            if(cnt==1){
                map.put(sortRes[i],"Gold Medal");
            }
            else if(cnt==2){
                map.put(sortRes[i],"Silver Medal");
                cnt--;
            }
            else if(cnt==3){
                map.put(sortRes[i],"Bronze Medal");
                cnt--;
            }
            else{
                map.put(sortRes[i], Integer.toString(cnt));
                cnt--;
            }
        }
        for(int i=0;i<len;i++){
            res[i] = map.get(nums[i]);
        }
        return res;
        
        
        //开始理解错了题意，是要求每个数字都排序
        // int len = nums.length;
        // int cnt = 0;
        // String[] res = new String[len];
        // for(int i=0;i<len;i++){
        //     if(cnt==0){
        //         res[cnt] = "Gold Medal";
        //     }
        //     else if(cnt==1){
        //         res[cnt] = "Silver Medal";
        //     }
        //     else if(cnt==2){
        //         res[cnt] = "Bronze Medal";
        //     }
        //     else{
        //         res[cnt] = Integer.toString(cnt+1);
        //     }
        //     cnt++;
        // }
        // return res;
    }
    
    public void addGrade(int index, String[] res, int grade){
        
        
        if(grade==1){
                res[index] = "Gold Medal";
            }
            else if(grade==2){
                res[index] = "Silver Medal";
            }
            else if(grade==3){
                res[index] = "Bronze Medal";
            }
            else{
                res[index] = Integer.toString(grade);
            }
    }
}
