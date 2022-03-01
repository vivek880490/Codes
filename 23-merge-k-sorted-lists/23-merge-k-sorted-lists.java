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
    public ListNode mergeKLists(ListNode[] lists) {
        
        PriorityQueue<ListNode>q=new PriorityQueue<>((a,b)->(a.val-b.val));
        
        //add all non null lists to queue
        for(ListNode l:lists){
            if(l!=null){
                q.add(l);
            }
        }
        
        ListNode dummy = new ListNode(-1);
        ListNode temp=dummy;
        
        while(q.size()>0){
            ListNode rem=q.poll();
            
            temp.next=rem;
            temp=temp.next;
            rem=rem.next;
            
            if(rem!=null) q.add(rem);
        }
        
        return dummy.next;
        
        
    }
}