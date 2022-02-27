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
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        
        Queue<Pair<TreeNode,Integer>>q=new LinkedList<>();
        
        q.add(new Pair(root,0));
        int w=0;
        
        while(!q.isEmpty()){
            int size=q.size();
            
            int lm = q.peek().getValue();
            int rm = q.peek().getValue();
            
            for(int i=0;i<size;i++){
                Pair<TreeNode,Integer>cur=q.remove();
                TreeNode node = cur.getKey();
                rm=cur.getValue();
                if(node.left!=null) q.add(new Pair(node.left,2*rm));
                if(node.right!=null) q.add(new Pair(node.right,2*rm+1));
                
            }
            w=Math.max(w,rm-lm+1);
        }
        return w;
    }
}