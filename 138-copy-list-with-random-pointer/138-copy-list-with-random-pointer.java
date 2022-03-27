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
        
        HashMap<Node, Node> map = new HashMap<>();
        
        Node copy = new Node(-1);
        Node cn = copy;
        
        Node cur = head;
        
        while(cur != null){
            Node node = new Node(cur.val);
            cn.next = node;
            map.put(cur, node);
            cur = cur.next;
            cn = cn.next;
        }
        
        copy = copy.next;
        
        Node c1 = copy;
        Node c2 = head;
        
        while(c2 != null){
            c1.random = (map.get(c2.random)!= null?map.get(c2.random):null);
            
            c2 = c2.next;
            c1 = c1.next;
        }
        
        return copy;
    }
}