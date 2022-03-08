class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        List<Integer> al = new ArrayList<>();
        
        PriorityQueue<int []> pq = new PriorityQueue<>((a,b)->((a[1]-b[1]==0?b[0]-a[0]:b[1]-a[1])));
        
        for(int i=0; i<arr.length; i++){
            
            if(pq.size() < k){
                pq.add(new int[]{arr[i],Math.abs(arr[i]-x)});
            }
            else{
                int rem[] = pq.peek();
              if(rem[1] > Math.abs(arr[i]-x)){
                  pq.remove();
                  pq.add(new int[]{arr[i],Math.abs(arr[i]-x)});
              }  
            }
            
        }
        
        while(pq.size() > 0){
            
            int rem [] = pq.remove();
            al.add(rem[0]);
        }
        
        Collections.sort(al);
        
        return al;
    }
}