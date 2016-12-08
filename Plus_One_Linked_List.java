/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode plusOne1(ListNode head) {
        if(helper(head)) {
            ListNode rst = new ListNode(1);
            rst.next = head;
            return rst;
        }
        return head;
    }
    public boolean helper(ListNode head) {
        if(head == null) {
            return true;
        } else {
            if(helper(head.next)) {
                if(head.val == 9 ) {
                    head.val = 0;
                    return true;
                } else {
                    head.val++;
                }
            } 
            return false;
        }
    } 

    public ListNode plusOne2(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode i = dummy, j = dummy;
        while(i.next != null) {
            i = i.next;
            if(i.val != 9) {
                j = i;
            }
        }
        if(i.val != 9) {
            i.val ++;
            return head;
        } else {
            j.val ++ ;
            j = j.next;
            while(j != null) {
                j.val = 0;
                j = j.next;
            }
        }
        if(dummy.val == 0) {
            return head;
        } else {
            return dummy;
        }
    }
    public ListNode plusOne3(ListNode head) {
        if(head == null) {
            return new ListNode(1);
        } else {
            ListNode rst = plusOne(head.next);
            if(rst != head.next) {
                if(head.val == 9) {
                    head.val = 0;
                    rst.next = head;
                    return rst;
                } else {
                    head.val ++;
                    return head;
                }
            } else {
                return head;
            }
        }
    }
}