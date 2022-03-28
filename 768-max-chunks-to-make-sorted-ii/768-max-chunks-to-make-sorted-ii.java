class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int rmin[] = new int[n+1];
        rmin[n] = Integer.MAX_VALUE;
        // right side se min calcuate
        for(int i=n-1; i>=0; i--){
            rmin[i] = Math.min(arr[i],rmin[i+1]);
        }
        
        int count = 0;
        int lmax = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++){
            lmax = Math.max(lmax, arr[i]);
            
            if(lmax <= rmin[i+1]){
                count++;
            }
        }
        return count;
    }
}