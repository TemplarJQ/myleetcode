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
    public TreeNode searchBST(TreeNode root, int val) {
        
        //注意，它是个搜索树
        if( root == null || root.val == val ){
            return root;
        }
        if( root.val < val ){
            return searchBST( root.right , val );
        } else {
            return searchBST( root.left  , val );
        }
        
        //自己写的：
        // if(root==null){
        //     return null;
        // }
        // if(root.val==val){
        //     return root;
        // }
        // TreeNode resLeft = searchBST(root.left, val);
        // TreeNode resRight = searchBST(root.right, val);
        // if(resLeft!=null){return resLeft;}
        // if(resRight!=null){return resRight;}
        // return null;
    }
}
