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
    public ListNode oddEvenList(ListNode head) {
        
        if(head==null || head.next==null) return head;
        
        ListNode deven = new ListNode(-1);
        ListNode dodd = new ListNode(-1);
        
        ListNode etail = deven;
        ListNode otail = dodd;        
        ListNode cur = head;
        int i=1;
        while( cur != null ){
            if(i%2 == 1){
                
                otail.next = cur;
                otail = otail.next;
                
            }
            else{
                
                etail.next = cur;
                etail = etail.next;
            }
            cur=cur.next;
            i++;
        }
        
        
        otail.next = deven.next;
        etail.next = null;
        return dodd.next;
        
        
        
        
       

    }
}