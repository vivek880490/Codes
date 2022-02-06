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
    public ListNode middleNode(ListNode head) {
        
        if(head==null || head.next==null) return head;
        
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        
        if(count%2==0){
            count=(count/2);
            while(count-->0){
                head=head.next;
            }
        }
        else{
            count=count/2;
            while(count-->0){
                head=head.next;
            }
        }
        return head;
        
        
        
    }
}