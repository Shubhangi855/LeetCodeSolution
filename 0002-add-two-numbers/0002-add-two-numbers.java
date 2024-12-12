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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = l1.val + l2.val;
        ListNode result = new ListNode(sum % 10);
        ListNode current = result;
        int carry = sum / 10;

        while (l1.next != null || l2.next != null) {
            int left = 0, right = 0;

            if (l1.next != null) {
                l1 = l1.next;
                left = l1.val;
            }
            if (l2.next != null) {
                l2 = l2.next;
                right = l2.val;
            }
            sum = carry + left + right;
            current.next = new ListNode(sum % 10);
            carry = sum / 10;
            current = current.next;
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return result;
    }
}