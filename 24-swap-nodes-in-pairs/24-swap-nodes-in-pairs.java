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
    public ListNode swapPairs(ListNode head) {
        
        ListNode dummy=new ListNode(0);
        
        ListNode prev=dummy;
  
        ListNode cur=head;
        
        dummy.next=head;
        
        while(cur!=null && cur.next!=null){
            
            prev.next=cur.next;
            cur.next=cur.next.next;
            prev.next.next=cur;
            cur=cur.next;
            prev=prev.next.next;
            
        }
        return dummy.next;
        
    }
}