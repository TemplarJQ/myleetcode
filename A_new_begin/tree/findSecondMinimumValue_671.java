/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        List<Integer> value = new ArrayList<>();
        int len = goTree(root, value, 0);
        int[] res = new int[len];
        int step = 0;
        for(Integer val:value){
            res[step++] = val;
        }
        Arrays.sort(res);
        if(len<=2){return -1;}
        
        for(int i=0;i<len-1;i++){
            if(res[i]!=res[i+1]){
                return res[i+1];
            }
        }
        return -1;
    }
    
    public int goTree(TreeNode root, List<Integer> value, int len) {
        if(root==null){return 0;}
        value.add(root.val);
        len++;
        if(root.left!=null){
            len += goTree(root.left, value, 0);
        }
        if(root.right!=null){
            len += goTree(root.right, value, 0);
        }
        return len;
    }
}
