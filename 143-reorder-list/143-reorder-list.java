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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        
        
        ListNode midd=mid(head);
        ListNode nhead=midd.next;
        midd.next=null;
        
        nhead=reverse(nhead);
        
        ListNode c1=head;
        ListNode c2=nhead;
        ListNode f1=null;
        ListNode f2=null;
        
        while(c1!=null && c2!=null){
            //backup
            
            f1=c1.next;
            f2=c2.next;
            
            //link
            c1.next=c2;
            c2.next=f1;
            
            //move
            
            c1=f1;
            c2=f2;
        }
       
     
        
    }
    
    ListNode mid(ListNode head){
        if(head==null || head.next==null) return head;
        
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    ListNode reverse(ListNode head){
        
        if(head==null || head.next==null) return head;
        
        ListNode cur=null;
        ListNode temp=head;
        
        while(temp!=null){
            ListNode forward=temp.next; // backup
            
            temp.next=cur; // link;
            //now move
            
            cur=temp;
            temp=forward;
            
        }
        return cur;
    }
}