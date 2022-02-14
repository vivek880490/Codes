/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        
        if(root==null) return "X";
        
        String l =serialize(root.left);
        String r=serialize(root.right);
        
        return root.val+","+l+","+r;
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String arr[]=data.split(",");
        Queue<String>q=new LinkedList<>();
        
        for(int i=0;i<arr.length;i++){
            q.add(arr[i]);
        }
        TreeNode root=solve(q);
        return root;
        
    }
    
TreeNode solve(Queue<String>q){
    
    if(q.size()==0) return null;
    String node=q.poll();
    
    if(node.equals("X")) return null;
    TreeNode root= new TreeNode(Integer.parseInt(node));
    
    root.left=solve(q);
    root.right=solve(q);
    return root;
    
}
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));