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
    public int rangeSumBST(TreeNode root, int L, int R) {
        //这个不是贼简单一个想法就是遍历然后记录输出？这是中等题？
        //还是要加一个剪枝
        int add = 0;
        if(root==null){return add;}
        if(root.val < L){
            return rangeSumBST(root.right, L, R);
        }
        if(root.val > R){
            return rangeSumBST(root.left, L, R);
        }
        if(root.val>=L&&root.val<=R){
            add += root.val;
            add += rangeSumBST(root.left,L,R);
            add += rangeSumBST(root.right,L,R);
        }
        return add;
    }
}
