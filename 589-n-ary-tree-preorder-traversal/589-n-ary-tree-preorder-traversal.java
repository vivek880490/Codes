/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        
        List<Integer>al = new ArrayList<>();
        
        solve(al,root);
        
        return al;
    }
    
    void solve(List<Integer>al,Node root){
        if(root==null) return ;
        
        al.add(root.val);
        
        for(Node node : root.children){
            solve(al,node);
        }
    }
}