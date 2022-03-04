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
        
        HashMap<Node,Node>map = new HashMap<>();
        
        Node cur = head;
        
        Node newhead = new Node(-1);
        
        Node prev = newhead;
        
        while(cur!=null){
            
            Node node = new Node(cur.val);
            
            prev.next = node;
            
            map.put(cur,node);
            
            prev = prev.next;
            cur = cur.next;

        }
        
        newhead = newhead.next;
        
        Node l1 = head;
        Node l2 = newhead;
        
        while(l1!=null){
            
            l2.random = (l1.random!=null?map.get(l1.random):null);
            
            l1 = l1.next;
            l2 = l2.next;
        }
        return newhead;
        
        
    }
}