// { Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.next());
		while(t-- > 0)
		{
		    int n = Integer.parseInt(sc.next());
		    int k = Integer.parseInt(sc.next());
		    
		    String[] words = new String[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        words[i] = sc.next();
		    }
		    
		    Solution ob = new Solution();
		  //  System.out.println(T.findOrder(words,k));
		    String order = ob.findOrder(words,n,k);
		    if(order.length() == 0){
		        System.out.println(0);
		        continue;
		    }
		    String temp[] = new String[n];
		    for(int i=0;i<n;i++)
		        temp[i] = words[i];
		    
		    Arrays.sort(temp, new Comparator<String>(){
		    
		      @Override
                public int compare(String a, String b) {
                    int index1 = 0;
                    int index2 = 0;
                    for(int i = 0; i < Math.min(a.length(), b.length()) 
                                        && index1 == index2; i++) {
                        index1 = order.indexOf(a.charAt(i));
                        index2 = order.indexOf(b.charAt(i));
                    }
                
                    if(index1 == index2 && a.length() != b.length()) 
                    {
                        if(a.length() < b.length())
                            return -1;
                        else
                            return 1;
                    }
                
                    if(index1 < index2)
                        return -1;
                    else
                        return 1;
                        
                }
		    });
		    
		    int flag = 1;
		    for(int i=0;i<n;i++)
		    {
		        if(!words[i].equals(temp[i]))
	            {
	                flag = 0;
	                break;
	            }
		    }
		    
		    System.out.println(flag);
		}
	}
	
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String findOrder(String [] dict, int N, int K)
    {
        // Write your code here
        
        HashMap<Character, HashSet<Character>> map = new HashMap<>();
        
        HashMap<Character,Integer> indegree = new HashMap<>();
        
        for(String s : dict){
            for(char ch : s.toCharArray()){
                indegree.put(ch,0);
            }
        }
        
        boolean flag = false;
        for(int i=0; i<dict.length-1; i++){
            String cur  = dict[i];
            String next = dict[i+1];
            
            int len = Math.min(cur.length(), next.length());
            
            for(int j=0; j<len; j++){
                char ch1 = cur.charAt(j);
                char ch2 = next.charAt(j);
                
                if(ch1 != ch2){
                    HashSet<Character> set = new HashSet<>();
                    
                    if(map.containsKey(ch1) == true){
                        set = map.get(ch1);
                        if(set.contains(ch2) == false){
                            set.add(ch2);
                            indegree.put(ch2, indegree.get(ch2)+1);
                            map.put(ch1,set);
                        }
                    }
                    else{
                        set.add(ch2);
                        indegree.put(ch2, indegree.get(ch2)+1);
                        map.put(ch1, set);
                        
                    }
                    flag = true;
                    break;
                }
            }
            
            if(flag == false && cur.length() > next.length()){
                return "";
            }
        }
        
        
        Queue<Character> q = new LinkedList<>();
        
        StringBuilder sb = new StringBuilder();
        
        for(char ch : indegree.keySet()){
            if(indegree.get(ch) == 0){
                q.add(ch);
            }
        }
        int count  = 0;
        while(q.size() > 0){
            char rem  = q.poll();
            
        sb.append(rem);
            count++;
            
            if(map.containsKey(rem) == true){
                HashSet<Character> nbr = map.get(rem);
                
                for(char x : nbr){
                    indegree.put(x, indegree.get(x)-1);
                    if(indegree.get(x) == 0){
                        q.add(x);
                    }
                }
            }
            
        }
        
        //System.out.println(sb.toString());
        
        if(count == indegree.size()){
            
            return sb.toString();
        }
        else{
            return "";
        }
        
        
    }
}