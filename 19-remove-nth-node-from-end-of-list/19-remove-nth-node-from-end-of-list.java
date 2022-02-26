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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head==null || head.next==null) return null;
        
        
        
        int count=1;
        
        ListNode temp=head;
        
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        
        if(count==n) return head.next;
        
        int v= count-n-1;
        ListNode vemp=head;
        while(v-->0){
            vemp=vemp.next;
            
        } 
        vemp.next=vemp.next.next;
        
        
       
        return head;
        
    }
}