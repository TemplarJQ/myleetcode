class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //这题其实蛮好懂的，就是维护一个映射对，如果先分为字符数组并排序后的结果一致，则属于同一序列
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
}
