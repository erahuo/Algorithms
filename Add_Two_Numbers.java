/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carrier = 0;
        ListNode head = new ListNode(0), pnt = head;
        while(l1 != null || l2 != null) {
            int num1 = l1 == null? 0:l1.val;
            int num2 = l2 == null? 0:l2.val;
            pnt.next = l1 == null? l2: l1;
            pnt = pnt.next;
            pnt.val = (num1 + num2 + carrier)%10;
            carrier = (num1 + num2 + carrier)/10;
            l1 = l1 == null? null: l1.next;
            l2 = l2 == null? null: l2.next;
        }
        if(carrier != 0) {
            pnt.next = new ListNode(1);
        }
        return head.next;
    }
}