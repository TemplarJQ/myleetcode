/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        //这个一个想法是遍历两次，第一次算长度，第二次算中间节点
        ListNode go = head;
        int len = 1;
        while(go.next!=null){
            go = go.next;
            len++;
        }
        len = len>>1;
        go = head;
        while(len>0){
            len--;
            go = go.next;
        }
        return go;
        
    }
}
