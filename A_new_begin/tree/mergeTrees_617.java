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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode root = new TreeNode(0);
        if(t1==null){
            root = t2;
        }else if(t2==null){
            root = t1;
        }else{
            preOrder(t1,t2,root);
        }
        return root;
    }
    
    public void preOrder(TreeNode t1, TreeNode t2, TreeNode pre) {
        pre.val = t1.val + t2.val;
        if(t1.left!=null&&t2.left!=null){
            pre.left = new TreeNode(0) ;
            preOrder(t1.left,t2.left,pre.left);
        }else if(t1.left==null){
            pre.left = t2.left;
        }else if(t2.left==null){
            pre.left = t1.left;
        }
        if(t1.right!=null&&t2.right!=null){
            pre.right = new TreeNode(0);
            preOrder(t1.right,t2.right,pre.right);
        }else if(t1.right==null){
            pre.right = t2.right;
        }else if(t2.right==null){
            pre.right = t1.right;
        }
    }
}
