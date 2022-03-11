// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().segregate(head);
		     printList(head);
		    System.out.println();
        }
    }
    
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}



// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        if(head == null || head.next == null) return head;
        // add your code here
        Node zero = new Node(-1);
        Node pz = zero;
        
         Node one = new Node(-1);
        Node po = one;
        
        Node two = new Node(-1);
        Node pt = two;
        
        Node cur = head;
        
        while(cur != null){
            
            if(cur.data == 0){
                pz.next = cur;
                pz = pz.next;
            }
            else if(cur.data ==1){
                po.next = cur;
                po = po.next;
            }
            else{
                pt.next = cur;
                pt = pt.next;
            }
            cur = cur.next;
        }
        po.next = two.next;
        pz.next = one.next;
        
        pt.next = null;
        
        return zero.next;
    }
}


