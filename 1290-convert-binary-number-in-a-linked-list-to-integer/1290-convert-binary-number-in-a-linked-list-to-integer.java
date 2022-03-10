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
    public int getDecimalValue(ListNode head) {
        
        ListNode temp = reverse(head);
        
        ListNode cur = temp;
        
        int ans = 0;
        int i = 0;
        
        while(cur != null){
            
            if(cur.val == 1){
                ans+=Math.pow(2,i);
            }
            cur = cur.next;
            i++;
        }
        
        return ans;
        
    }
    
    ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        
        ListNode temp = head;
        ListNode cur = null;
        
        while(temp != null){
            ListNode forw = temp.next;
            
            temp.next = cur;
            
            cur = temp;
            temp = forw;
        }
        return cur;
    }
}