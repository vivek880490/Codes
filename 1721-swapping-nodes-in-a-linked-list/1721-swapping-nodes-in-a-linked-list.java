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
    public ListNode swapNodes(ListNode head, int k) {
        
        if(head == null || head.next == null) return head;
        
        
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode beg = head;
        
        while(k --> 1){
            fast = fast.next;
        }
        beg = fast;
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        int temp = beg.val;
        beg.val = slow.val;
        slow.val = temp;
        
        return head;
        
    }
}