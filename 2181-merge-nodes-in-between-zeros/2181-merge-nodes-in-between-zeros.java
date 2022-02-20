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
    public ListNode mergeNodes(ListNode head) {
        
        ListNode dummy=new ListNode(0);
        
        ListNode temp=dummy;
        ListNode cur=head;
        
        while(cur.next!=null){
            int total=0;
            ListNode itr=cur;
            while(itr.next.val!=0){
                total+=itr.next.val;
                itr=itr.next;
            }
            cur=itr.next;
            ListNode nextd=new ListNode(total);
            temp.next=nextd;
            temp=temp.next;
        }
        
        return dummy.next;
    }
}