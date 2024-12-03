/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
          ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
                if(slow == fast){
                    break;
                }
        }
        if(fast == null || fast.next == null) return null;
                    fast = head;
                    // int idx = 0;
                    while(fast != slow){
                        fast = fast.next;
                        slow = slow.next;
                        // idx++;
                    // ListNode ans = new ListNode(idx);
                    }
                    
                // ListNode newNode = new ListNode(-1);
            return slow;
    }
}