// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int k)
    {
        ArrayList<Long> al = new ArrayList<>();
        
        int i = 0;
        int j = 0;

        Queue<Long> q = new LinkedList<>();
        
        while(j < N){
            if(A[j] < 0 ){
                q.add(A[j]);
            }
            if(j-i+1 < k){
                j++;
            }
            else if(j-i+1 == k){
                if(q.size() == 0){
                    al.add(0L);
                }
                else{
                    al.add(q.peek());
                    if(A[i]<0){
                    q.poll();
                        
                    }
                  
                }
            i++;
            j++;
            }
            
        }
        
        long ans[] = new long[al.size()];
        
        int l = 0;
        
        for(long x : al){
            ans[l] = x;
            l++;
        }
        
        return ans;
    }
}