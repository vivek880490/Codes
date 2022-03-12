/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
    
        HashMap<Node,Node> map = new HashMap<>();
        
        Node copy = new Node(-1);
        Node cn  = copy;
        
        Node cur = head;
        
        while(cur != null){
            
            Node node = new Node(cur.val);
            
            cn.next = node;
            
            map.put(cur,node);
            
            cn = cn.next;
            cur = cur.next;
        }
        
        copy = copy.next;
        
        Node c1 = head;
        Node c2 = copy;
        
        while(c1 != null){
            
            c2.random = (c1.random!=null?map.get(c1.random):null);
            
            c1 = c1.next;
            c2 = c2.next;
            
            
        }
        return copy;
    }
}