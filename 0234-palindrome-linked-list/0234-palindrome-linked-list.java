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
    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return false;
        }
        
        if(head.next==null){
            return true;
        }
        
        ListNode curr = head;
        ArrayList<Integer> sol = new ArrayList<>();
        while(curr!=null){
            sol.add(curr.val);
            curr = curr.next;
        }
        int n = sol.size();
        
        for(int i=0;i<n/2;i++){
            if(sol.get(i)!=sol.get(n-i-1)){
                return false;
            }
        }
        return true;
    }
}