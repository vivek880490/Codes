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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode dummy = new ListNode(101);
        
        ListNode itr = dummy;
        ListNode cur = head;
        
        while(cur != null){
            
            while(cur != null && itr.val == cur.val ){
                cur = cur.next;
            }
            
            itr.next = cur;
            itr = itr.next;
            
            if(cur != null) cur = cur.next;
        }
        
        return dummy.next;
        
    }
}