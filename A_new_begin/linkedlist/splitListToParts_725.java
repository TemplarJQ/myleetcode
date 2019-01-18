/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        //先思考
        //实际上情况有两种，一是k比长度大，有null，剩下的都是长度为1的
        //错误：二是长度大于k，len/k是每一小块里的个数，第一块要再加上len%k
        //这种思考是错误的，第一块里并不是加上len%k，比如[0,1,2,3,4]就是[0,1],[2,3],[4]这样
        //所以设计一个函数抽离出来插入的过程和插入的节点个数
        //所以先计算长度
        ListNode[] res = new ListNode[k];
        if(root==null){return res;}
        int len = 1;
        ListNode cnt = root;
        while(cnt.next!=null){
            len++;
            cnt = cnt.next;
        }
        if(k>len){
            for(int i=0;i<len;i++){
                res[i] = root;
                root = root.next;
                res[i].next = null;
            }
            return res;
        }else{
            int num = len/k;//每个区块的个数设置一个数组算每个区块的个数
            int add = len%k;
            int[] cntK = new int[k];
            for(int i=0;i<k;i++){
                cntK[i] = num;
                if(add>0){
                    cntK[i]++;
                    add--;
                }
            }
            for(int i=0;i<k;i++){
                root = insertNode(res, i, root, cntK[i]);
            }
        }
        return res;
    }
    
    public ListNode insertNode(ListNode[] res, int index, ListNode root, int num) {
        ListNode temp = new ListNode(root.val);
        res[index] = temp;
        int p = num;
        while(p>1){
            root = root.next;
            temp.next = new ListNode(root.val);
            temp = temp.next;
            p--;
        }
        root = root.next;
        return root;
    }
}
