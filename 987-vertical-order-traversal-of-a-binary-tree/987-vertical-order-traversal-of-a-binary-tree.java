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
    
    class pair{
        TreeNode node = null;
        int hl =0 ;
        
        pair(TreeNode node, int hl){
            this.node = node;
            this.hl = hl;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        List<List<Integer>>al = new ArrayList<>();
        
        if(root == null) return al;
        
        PriorityQueue<pair> parq = new PriorityQueue<>((a,b) -> (a.node.val)-(b.node.val));
        PriorityQueue<pair> childq = new PriorityQueue<>((a,b) -> (a.node.val)-(b.node.val));
        
        int ans[] = new int[2];
        
        width(root, ans, 0);
        
        int len = ans[1] - ans[0] + 1;
        
        
        // initiate all the al inside al
        List<List<Integer>> res = new ArrayList<>();
        
        for(int i=0; i<len; i++) res.add(new ArrayList<>());
        
        parq.add(new pair(root, Math.abs(ans[0])));
        
        while(parq.size() > 0){
            
            int size = parq.size();
            
            while(size --> 0){
                
                pair rem = parq.poll();
                
                TreeNode node = rem.node;
                
                int hl = rem.hl;
                
                res.get(hl).add(node.val);
                
                if(node.left != null) childq.add(new pair(node.left,hl-1));
                 if(node.right != null) childq.add(new pair(node.right,hl+1));
                
                
            }
            
            PriorityQueue<pair> temp = parq;
            parq = childq;
            childq = temp;
            
            }
        
        return res;
    }
    
    void width(TreeNode root, int ans[],int hl){
        if(root == null) return;
        
        ans[0] = Math.min(ans[0],hl);
        ans[1] = Math.max(ans[1],hl);
        
        width(root.left, ans, hl-1);
        width(root.right, ans, hl+1);
    }
}