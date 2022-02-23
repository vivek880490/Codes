/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node ==null) return null;
        Node newnode=new Node(node.val,new ArrayList<>());
        HashMap<Node, Node>map=new HashMap<>();
        
        Queue<Node>q=new LinkedList<>();
        
        q.add(node);
        
        map.put(node,newnode);
        
        while(q.size()>0){
            Node h=q.poll();
            for(Node neighbor:h.neighbors){
            if(map.containsKey(neighbor)==false){
                map.put(neighbor,new Node(neighbor.val,new ArrayList<>()));
                q.add(neighbor);
            }
                map.get(h).neighbors.add(map.get(neighbor));
        }
        }
        
        return newnode;
    }
}