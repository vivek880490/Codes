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
        
        if(head==null || head.next==null) return head;
        
        ListNode d=new ListNode(-1);
        
        ListNode itr=d;
        itr.next=head;
        
        ListNode cur=head.next;
        
        while(cur!=null){
            
            boolean flag=false;
            while(cur!=null && itr.next.val==cur.val){
                cur=cur.next;
                 flag=true;
            }
            
            if(flag==true){
                itr.next=cur;
            }
            else{
                itr=itr.next;
            }
            
            if(cur!=null) cur=cur.next;
            
            
        }
        return d.next;
        
    }
}