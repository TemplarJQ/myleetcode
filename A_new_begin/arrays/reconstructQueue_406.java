class Solution {
    public int[][] reconstructQueue(int[][] people) {
        // int row = people.length;
        // int col = people[0].length;
        // int[][] res = new int[row][col];
        //开始的一个想法是构建一个map映射关系来记录这个问题。
        
        
        //附一个别人的做法
        /*
            7	0	
            7	1	
            6	1	
            5	0	
            5	2	
            4	4

            x	y
            5	0
            7	0
            5	2
            6	1
            4	4
            7	1

            1.h降序，n升序(次)排序 (或直接以h*1000-n降序排序)
            2.依次以n为下标插入
            每次插入时
            在序列中的所有元素，都不小于当前元素，且保证n较小的元素被包括在<=当前元素的序列内
        */
        if(people == null || people.length == 0 || people[0].length == 0){
            return new int[0][0];
        }
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o1[1] - o2[1];
                }
                return o2[0] - o1[0];
            }
        });

        int n = people.length;
        List<int[]> tmp = new ArrayList<>();
        for(int i = 0;i < n;i++){
            tmp.add(people[i][1],new int[]{people[i][0],people[i][1]});
        }
        int[][] ret = new int[n][2];
        for(int i = 0;i < n;i++){
            ret[i][0] = tmp.get(i)[0];
            ret[i][1] = tmp.get(i)[1];
        }
        return ret;
    }
}
