/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        //先排除两种特殊情况
        if(head==null){return null;}
        if(head.next==null){return head;}
        //先找到尾部最后一个节点，并且输出节点个数
        ListNode tail = head;
        int len = 1;
        while(tail.next!=null){
            tail = tail.next;
            len++;
        }
        ListNode first = head;
        ListNode mid = tail;
        if(len==2){return head;}
        //按照奇偶来
        if(len%2==1){
            while(first.next.next!=mid){
                ListNode temp = first.next;
                first.next = temp.next;
                temp.next = tail.next;
                tail.next = temp;
                first = first.next;
                tail = tail.next;
            }
            ListNode temp = first.next;
            first.next = mid;
            temp.next = tail.next;
            tail.next = temp;
        }else{
            while(first.next!=mid){
                ListNode temp = first.next;
                first.next = temp.next;
                temp.next = tail.next;
                tail.next = temp;
                first = first.next;
                tail = tail.next;
            }
            //对tail的处理不一样
            first.next = mid.next;
            mid.next = tail.next;
            tail.next = mid;
        }
        return head;
    }
}
