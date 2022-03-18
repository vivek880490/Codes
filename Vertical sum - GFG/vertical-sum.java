// { Driver Code Starts
//Initial Template for Java

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

class GfG {
    
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
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
        	    Solution g = new Solution();
			
			    ArrayList <Integer> res = g.verticalSum(root);
			    for (Integer num : res) System.out.print (num + " ");
			    System.out.println();
                t--;
            
        }
    }
  
}

// } Driver Code Ends


/*Complete the function below
Node is as follows:
class Node{
int data;
Node left, right;
Node(int item)
{
    data = item;
    left = right = null
}
}
*/
class Solution{
    class pair{
        Node node = null;
        int hl = 0;
        
        pair(Node node, int hl){
            this.node = node;
            this.hl = hl;
        }
    }
    public ArrayList <Integer> verticalSum(Node root) {
        // add your code here
        int ans[] = new int[2];
        
        width(root, 0, ans);
        
        int len = ans[1] - ans[0] + 1;
        
        
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i=0; i<len; i++){
            al.add(0);
        }
        
        
        Queue<pair> q = new LinkedList<>();
        
        q.add(new pair(root, Math.abs(ans[0])));
        
        while(q.size() > 0){
            int size = q.size();
            
            while(size --> 0){
                
                pair rem = q.poll();
                
                Node temp = rem.node;
                
                int hl = rem.hl;
                
                al.set(hl, al.get(hl) + temp.data);
                
                if(temp.left != null) q.add(new pair(temp.left,hl-1));
                if(temp.right != null) q.add(new pair(temp.right, hl+1));
                
                
            }
        }
        
        return al;
        
    }
    
    void width(Node root, int hl, int ans[]){
        if(root == null) return ;
        
        ans[0] = Math.min(ans[0], hl);
        ans[1] = Math.max(ans[1], hl);
        
        width(root.left, hl-1, ans);
        width(root.right, hl+1, ans);
        
    }
}
