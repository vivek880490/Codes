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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        if(head==null || head.next == null || k<=0) return head;
        
        int len = length(head);
        
        ListNode oh = null;
        ListNode ot = null;
        
        ListNode cur = head;
        
        while(len >= k){
            int temp = k;
            
            while(temp --> 0){
                ListNode forw = cur.next;
                cur.next = null;
                
                addfirst(cur);
                
                cur = forw;
            }
                
                if(oh==null){
                    oh = th;
                    ot = tt;
                }
                else{
                    ot.next = th;
                    ot = tt;
                }
                th = null;
                tt = null;
                len -= k;
            }
            ot.next = cur;
            return oh;
        
         
        
    }
    
    int length(ListNode node){
        int count=0;
        ListNode temp = node;
        
        while(temp != null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    
    ListNode th = null;
    ListNode tt = null;
    
    void addfirst(ListNode node){
        
        if(th==null){
            th = node;
            tt = node;
        }
        else{
            node.next=th;
            th=node;
        }
    }
        
}