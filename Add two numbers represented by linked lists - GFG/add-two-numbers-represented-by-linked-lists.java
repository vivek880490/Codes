// { Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}
// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node l1, Node l2){
        // code here
        // return head of sum list
         // if(l1 == null) return l2;
        // if(l2 == null) return l1;
        
        Node r1 = reverse(l1);
        Node r2 = reverse(l2);
        
        Node c1 = r1;
        Node c2 = r2;
        
        Node dummy = new Node(-1);
        
        Node itr = dummy;
        
        int carry = 0;
        
        while(c1 != null || c2 != null || carry != 0){
            
            int sum = (c1 != null ? c1.data:0) + (c2 !=null ? c2.data:0) + carry;
            
            int ld = sum % 10;
            carry = sum / 10;
            
            itr.next = new Node(ld);
            
            itr = itr.next;
            
            if(c1 != null) c1 = c1.next;
            if(c2 != null) c2 = c2.next;
            
        }
        return reverse(dummy.next);
        
        
    }
    
    static Node reverse(Node head){
        
        //if(head == null || head.next == null) return head;
        
        Node cur = null;
        
        Node temp = head;
        
        while(temp != null){
            
            Node forw = temp.next;
            
            temp.next = cur;
            
            cur = temp;
            temp = forw;
        }
        
        return cur;
    }
}