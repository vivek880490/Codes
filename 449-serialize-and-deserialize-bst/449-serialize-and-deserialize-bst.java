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
        
        String l=serialize(root.left);
        String r=serialize(root.right);
        
        return root.val+","+l+","+r;
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        
        if(data.isEmpty()) return null;
        String s[]=data.split(",");
        Queue<String>q=new LinkedList<>();
        
        for(int i=0;i<s.length;i++){
            
            q.add(s[i]);
        }
        
        TreeNode root=solve(q,Integer.MIN_VALUE,Integer.MAX_VALUE);
        
        return root;
        
        
        
    }
    
    TreeNode solve(Queue<String>q,int l,int h){
        
        if(q.isEmpty()) return null;
        
        String s=q.poll();
        if(s.equals("X")) return null;
        
        
        int val=Integer.parseInt(s);
        
        if(val<l || val>h) return null;
        
        TreeNode root=new TreeNode(val);
        root.left=solve(q,l,val);
        root.right=solve(q,val,h);
        return root;
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;