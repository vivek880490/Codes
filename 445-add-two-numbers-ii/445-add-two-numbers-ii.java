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
        ListNode t1 = reverse(l1);
        ListNode t2 = reverse(l2);
        ListNode rev = solve(t1, t2);
        return reverse(rev);
    }
    
    ListNode reverse(ListNode head){
        ListNode cur = null;
        ListNode temp = head;
        
        while(temp != null){
            ListNode next = temp.next;
            
            temp.next = cur;
            
            cur = temp;
            temp = next;
        }
        return cur;
    }
    
    public ListNode solve(ListNode l1, ListNode l2) {
        
        ListNode r1 = l1;
        ListNode r2 = l2;
        
        ListNode dummy = new ListNode(-1);
        
        ListNode itr = dummy;
        
        int carry = 0;
        
        while(r1 != null || r2 != null || carry != 0){
            
            int sum = carry + (r1 !=null?r1.val:0) + (r2 != null?r2.val:0);
            
            int rd = sum%10;
            carry = sum/10;
            
            itr.next = new ListNode(rd);
            
            itr = itr.next;
            
            if(r1 != null) r1 = r1.next;
            if(r2 != null) r2 = r2.next;
            
        }
        
        return dummy.next;
        
    }
}
