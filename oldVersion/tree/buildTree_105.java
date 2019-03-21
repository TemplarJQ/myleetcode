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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //高票的方法和我这个是大同小异，没什么差别；
        if(preorder.length==0){return null;}
        TreeNode res = addNode(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
        return res;
    }
    
    public TreeNode addNode(int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd) {
        TreeNode tree = new TreeNode(preorder[preStart]);
        if(preStart==preEnd){return tree;}
        int root = 0;
        for(root=inStart;root<inEnd;root++){
            if(inorder[root]==preorder[preStart]){
                break;
            }
        }
        int leftlen = root - inStart;
        int rightlen = inEnd - root;
        if(leftlen>0){
            tree.left = addNode(preorder,inorder,preStart+1,preStart+leftlen,inStart,root-1);
        }
        if(rightlen>0){
            tree.right = addNode(preorder,inorder,preStart+1+leftlen,preEnd,root+1,inEnd);
        }
        return tree;
    }
}
