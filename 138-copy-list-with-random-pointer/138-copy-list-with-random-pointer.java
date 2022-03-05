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
        create(head);
        copy(head);
        
        return extract(head);
        
    }
    
    void create(Node head){
        
        Node cur = head;
        
        while(cur != null){
            Node forw = cur.next;
            
            Node node = new Node(cur.val);
            
             cur.next = node;
            
            node.next = forw;
            
            cur = forw;
        }
    }
    
    void copy(Node head){
        
        Node cur = head;
        
       
        
        while(cur!=null){
             Node random = cur.random;
            if(random!=null){
                
                cur.next.random = random.next;
            }
            cur = cur.next.next;
        }
    }
    
    Node extract(Node head){
        
        Node dummy = new Node(-1);
        
        Node cur = head;
        Node prev = dummy;
        
        while(cur!=null){
            prev.next = cur.next;
            cur.next = cur.next.next;
            
            prev = prev.next ;
            
            cur = cur.next;
        }
        return dummy.next;
        
    }
}