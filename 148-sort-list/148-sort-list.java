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
    public ListNode sortList(ListNode head) {
        
        if(head==null || head.next==null) return head;
        
        ListNode midd=mid(head);
        
        ListNode nhead=midd.next;
        midd.next=null;
        
        return (merge(sortList(head),sortList(nhead)));
        
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
    
    
    ListNode merge(ListNode l1,ListNode l2){
        if(l1==null || l2==null) return l1==null?l2:l1;
        
        ListNode temp1=l1;
        ListNode temp2=l2;
        
        ListNode dummy=new ListNode(-1);
        
        ListNode cur=dummy;
        
        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                cur.next=temp1;
                temp1=temp1.next;
            }
            else if(temp1.val>=temp2.val){
                cur.next=temp2;
                temp2=temp2.next;
            }
            cur=cur.next;
            
        }
        
        cur.next=temp1==null?temp2:temp1;
        return dummy.next;

    }
}