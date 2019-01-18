/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        //这个题肯定要算链表的长度
        if(head==null){return null;}
        int len = 1;
        ListNode tail = head;
        while(tail.next!=null){
            len++;
            tail = tail.next;
        }
        if(k>=len){k = k%len;}//长于len则转回来
        if(len==1||k==0){return head;}
        int mid = len-k;
        ListNode midNode = head;
        while(mid>1){
            mid--;
            midNode = midNode.next;
        }
        ListNode temp = midNode.next;
        midNode.next = null;
        tail.next = head;
        return temp;
    }
}
