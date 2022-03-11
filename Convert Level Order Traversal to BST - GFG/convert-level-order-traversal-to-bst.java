// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class Main {
    
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            GFG obj = new GFG();
            Node tree = obj.constructBST(arr);
            preorder(tree);
            System.out.println();
        }
	}
	
	 public static void preorder(Node root){
        if(root == null){
            return;
        }
        
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
}

// } Driver Code Ends


//User function Template for Java


class GFG 
{
    //Function to construct the BST from its given level order traversal.
    
    class pair{
        Node par = null;
        int lb = -(int)1e9;
        int rb = (int)1e9;
        
        pair(Node par,int lb, int rb){
            this.par = par;
            this.lb = lb;
            this.rb = rb;
            
        }
        
        pair(){
            
        }
    }
    public Node constructBST(int[] arr)
    {
        //Write your code here 
        Queue<pair> q = new LinkedList<>();
        q.add(new pair());
        
        Node root = null;
        int idx = 0;
        
        while(q.size()>0 && idx<arr.length){
            
            pair rem = q.poll();
            
            int element = arr[idx];
            
            if(element < rem.lb || element > rem.rb) continue;
            
            Node node = new Node(element);
            idx++;
            
            if(rem.par==null) root=node;
            
            else{
                
                Node par = rem.par;
                
                if(element <= par.data) par.left = node;
                else par.right = node;
            }
            
            q.add(new pair(node,rem.lb,element));
             q.add(new pair(node,element,rem.rb));
            
        }
        
        return root;
        
    }
}