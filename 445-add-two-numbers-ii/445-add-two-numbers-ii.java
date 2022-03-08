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
        
        // if(l1 == null) return l2;
        // if(l2 == null) return l1;
        
        ListNode r1 = reverse(l1);
        ListNode r2 = reverse(l2);
        
        ListNode c1 = r1;
        ListNode c2 = r2;
        
        ListNode dummy = new ListNode(-1);
        
        ListNode itr = dummy;
        
        int carry = 0;
        
        while(c1 != null || c2 != null || carry != 0){
            
            int sum = (c1 != null ? c1.val:0) + (c2 !=null ? c2.val:0) + carry;
            
            int ld = sum % 10;
            carry = sum / 10;
            
            itr.next = new ListNode(ld);
            
            itr = itr.next;
            
            if(c1 != null) c1 = c1.next;
            if(c2 != null) c2 = c2.next;
            
        }
        return reverse(dummy.next);
        
        
    }
    
    ListNode reverse(ListNode head){
        
        //if(head == null || head.next == null) return head;
        
        ListNode cur = null;
        
        ListNode temp = head;
        
        while(temp != null){
            
            ListNode forw = temp.next;
            
            temp.next = cur;
            
            cur = temp;
            temp = forw;
        }
        
        return cur;
    }
}