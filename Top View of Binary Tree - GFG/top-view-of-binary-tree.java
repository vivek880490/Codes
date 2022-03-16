// { Driver Code Starts
//Initial Template for JAVA

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

public class Tree {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
    	    	
                Solution ob = new Solution();

                ArrayList<Integer> vec = ob.topView(root);
                for(int x : vec)
                    System.out.print(x + " ");
                System.out.println();
        	
                t--;   
        }
    }
}// } Driver Code Ends


//User function Template for Java

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    
    class pair{
        Node node = null;
        int hl = 0;
        
        pair(Node node, int hl){
            this.node = node;
            this.hl = hl;
        }
    }
     ArrayList<Integer> topView(Node root)
    {
        ArrayList<Integer> al = new ArrayList<>();
        
        if(root == null) return al;
        
        int width[] = new int[2];
        
        solve(root, 0, width);
        
        int len = width[1]-width[0]+1;
        
        for(int i=0; i<len; i++) al.add(null);
        
        Queue<pair> q = new LinkedList<>();
        
        q.add(new pair(root, Math.abs(width[0])));
        
        while(q.size() > 0){
            int size = q.size();
            while(size --> 0){
                pair rem = q.poll();
                
                Node node = rem.node;
                int hl = rem.hl;
                if(al.get(hl)==null){
                al.set(hl, node.data);
                    
                }
                
                if(node.left != null) q.add(new pair(node.left, hl-1));
                if(node.right != null) q.add(new pair (node.right, hl+1));
            }
        }
        
        return al;
    }
    
    void solve(Node root, int hl, int ans[]){
        if(root == null) return;
        
        ans[0] = Math.min(hl,ans[0]);
        ans[1] = Math.max(hl,ans[1]);
        
        solve(root.left, hl-1, ans);
        solve(root.right, hl+1, ans);
    }
}