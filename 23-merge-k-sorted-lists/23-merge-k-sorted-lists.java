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
        
        if(lists.length == 0) return null;
        
        return mergeklist(lists,0,lists.length-1);
        
    }
    // divide
    ListNode mergeklist(ListNode lists[],int l,int h){
        
        if(l>h) return null;
        if(l == h) return lists[l];
        
        int mid = (l+h)/2;
        
        ListNode l1 = mergeklist(lists,l,mid);
        ListNode l2= mergeklist(lists,mid+1,h);
        
        return merge(l1,l2);
    }
    //merge two sorted linked list
    ListNode merge(ListNode l1, ListNode l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        
        while(cur1!=null && cur2!=null){
            if(cur1.val<cur2.val){
                temp.next=cur1;
                cur1=cur1.next;
            }
            else{
                temp.next=cur2;
                cur2=cur2.next;
            }
            temp=temp.next;
        }
        temp.next = cur1==null?cur2:cur1;
        
        return dummy.next;
    }
}