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
    public int deepestLeavesSum(TreeNode root) {
        
        Queue<TreeNode>q=new LinkedList<>();
        List<List<Integer>>al=new ArrayList<>();
        
        
        q.add(root);
        while(q.size()>0){
            int count=q.size();
             ArrayList<Integer>temp=new ArrayList<>();
            for(int i=0;i<count;i++){
                root=q.poll();
               
                temp.add(root.val);
                
                if(root.left!=null){
                    q.add(root.left);
                }
                if(root.right!=null){
                    q.add(root.right);
                }
                
            }
            al.add(temp);
            
        }
        
        ArrayList<Integer>res=new ArrayList<>(al.get(al.size()-1));
        
       
        
        System.out.print(res);
        int sum=0;
        for(int i=0;i<res.size();i++){
            sum+=res.get(i);
        }
        return sum;
        
        
        
    }
}