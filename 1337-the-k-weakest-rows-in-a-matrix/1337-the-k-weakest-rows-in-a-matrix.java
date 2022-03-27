class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        
        int arr[] = new int[mat.length];
        
        for(int i=0; i<mat.length; i++){
            int num  = 0;
            for(int j=0; j<mat[0].length; j++){
                num += mat[i][j];
            }
            arr[i] = num;
        }
        
     PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1] == b[1]?a[0]-b[0]: a[1]-b[1]);
     
        for(int i=0; i<arr.length; i++){
            pq.add(new int[]{i,arr[i]});
        }
        
        int ans[] = new int[k];
        int v = 0;
        while(k --> 0){
            int temp[] = pq.poll();
            ans[v] = temp[0];
            v++;
        }
        
        return ans;
        
        
    }
}