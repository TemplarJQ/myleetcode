/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null){return null;}
        //先计算链表长度
        ListNode step = head;
        int len = 1;
        while(step.next!=null){
            len++;
            step = step.next;
        }
        if(len==1){return new TreeNode(head.val);}
        //构建数组
        step = head;
        int[] value = new int[len];
        for(int i=0;i<len;i++){
            value[i] = step.val;
            step = step.next;
        }
        //开始建树
        return help(value,0,len);
    }
    
    public TreeNode help(int[] arr,int from,int to){
        if(from >= to){
            return null;
        }
        int mid = (from+to)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = help(arr,from,mid);
        root.right = help(arr,mid+1,to);
        return root;
    }
    
    //这是自己的插入方法
    public TreeNode insert(TreeNode root, int value) {
        if(value>root.val){
            root.right = new TreeNode(value);
            return root.right;
        }else{
            root.left = new TreeNode(value);
            return root.left;
        }
        
    }
    
}
