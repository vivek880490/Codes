// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(s[i + 1]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int[] ans = obj.topK(nums, k);
            for (int i = 0; i < ans.length; i++) System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    public int[] topK(int[] nums, int k) {
        // Code here
        HashMap<Integer, Integer> map = new HashMap<>();
        
        PriorityQueue<int[]>pq = new PriorityQueue<>((a,b)->(a[1]==b[1]?a[0]-b[0]:a[1]-b[1]));
        for(int i=0; i<nums.length; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
       for(int key : map.keySet()){
          pq.add(new int[]{key, map.get(key)});
          if(pq.size() > k){
              pq.poll();
          }
       }
       
       int ans[] = new int[k];
       int j = k-1;
       while(pq.size() > 0){
           int rem[] = pq.poll();
           ans[j] = rem[0];
           j--;
       }
       //Arrays.sort(ans);
       
       return ans;
    }
}