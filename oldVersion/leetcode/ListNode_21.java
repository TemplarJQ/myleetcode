package leetcode;

public class ListNode_21 {
	int val;
    ListNode_21 next;
    ListNode_21(int x) { val = x;}
    
    public ListNode_21 mergeTwoLists(ListNode_21 l1, ListNode_21 l2) {
    	ListNode_21 listNode = new ListNode_21(0);
        ListNode_21 firstNode = listNode;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                listNode.next = l1;
                l1 = l1.next;
            } else {
                listNode.next = l2;
                l2 = l2.next;
            }
            listNode = listNode.next;
        }
        while (l1 != null) {
            listNode.next = l1;
            l1 = l1.next;
            listNode = listNode.next;
        }
        while (l2 != null) {
            listNode.next = l2;
            l2 = l2.next;
            listNode = listNode.next;
        }
        return firstNode.next;
    }

    public static void main(String[] args) {
		
	}
}
