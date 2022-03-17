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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubPath(ListNode s, TreeNode t) {
        
        if(t==null) return false;
        
        if(same(s,t)) return true;
        
        return isSubPath(s,t.left) || isSubPath(s,t.right);
    }
    
    boolean same(ListNode s,TreeNode t){
        if(s==null) return true;
        if(t == null) return false;
        
        if(s.val==t.val){
            return same(s.next,t.left) || same(s.next,t.right);
        }
            return false;
        
    }
    
}