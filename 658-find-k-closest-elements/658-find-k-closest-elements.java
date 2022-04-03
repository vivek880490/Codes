class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(a[1]==b[1]?b[0]-a[0]:b[1]-a[1]));
        
        for(int i=0; i<arr.length; i++){
            pq.add(new int[]{arr[i],Math.abs(x-arr[i])});
            
            if(pq.size() > k){
                pq.poll();
            }
            
        }
        List<Integer> ans = new ArrayList<>();
        
        while(pq.size() >0){
            int rem[] = pq.poll();
            ans.add(rem[0]);
        }
        Collections.sort(ans);
        return ans;
        
        
    }
}