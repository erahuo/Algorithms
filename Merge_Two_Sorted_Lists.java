/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode pnt1 = l1, pnt2 = l2;
        ListNode head = new ListNode(-1), pnt = head;
        while(pnt1 != null || pnt2 != null) {
            if(pnt2 == null || (pnt1 != null && pnt1.val < pnt2.val)) {
                pnt.next = pnt1;
                pnt1 = pnt1.next;
            } else {
                pnt.next = pnt2;
                pnt2 = pnt2.next;
            }
            pnt = pnt.next;
        }
        return head.next;
    }
}