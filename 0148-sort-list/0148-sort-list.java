/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
     if (head == null || head.next == null) return head;
        ListNode m = getMid(head);
        ListNode r = sortList(m.next);
        m.next = null;
        ListNode l = sortList(head);
        return merge(l, r);
    }

    ListNode getMid(ListNode h) {
        ListNode f = h, s = h;
        while (f.next != null && f.next.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    ListNode merge(ListNode l1, ListNode l2) {
        ListNode h = null;
        if (l1.val < l2.val) {
            h = l1;
            l1 = l1.next;
        }
        else {
            h = l2;
            l2 = l2.next;
        }
        ListNode p = h;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            }
            else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        p.next = l1 != null ? l1 : l2;
        return h;
    }
      
}