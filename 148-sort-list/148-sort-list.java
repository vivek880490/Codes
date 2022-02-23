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
        
        ArrayList<Integer>al=new ArrayList<>();
        
        ListNode temp=head;
        while(temp!=null){
            al.add(temp.val);
            temp=temp.next;
        }
        
        Collections.sort(al);
        
        ListNode dummy=new ListNode(-1);
        
        ListNode cur=dummy;
       
        for(int i=0;i<al.size();i++){
            ListNode tem=new ListNode(al.get(i));
             cur.next=tem;
             cur=cur.next;
          
        }
           
        
        
        return dummy.next;
        
    }
}