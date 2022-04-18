class Solution {
    public int largestAltitude(int[] gain) {
        
        int ans = 0;
        
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<gain.length; i++){
            ans+=gain[i];
            max = Math.max(ans, max);
        }
        return max<0?0:max;
    }
}