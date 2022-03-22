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
    public List<List<Integer>> levelOrder(Node root) {
        
        
        
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        
        Queue<Node> q = new LinkedList<>();
        
        q.add(root);
        
        while(q.size() > 0){
            
            List<Integer>temp = new ArrayList<>();
            
            int len = q.size();
            
            for(int i=0; i<len; i++){
                Node cur = q.poll();
                
                temp.add(cur.val);
                
                for(Node x : cur.children){
                    q.add(x);
                }
            }
            
        res.add(temp);
        }
        
        return res;
    }
}