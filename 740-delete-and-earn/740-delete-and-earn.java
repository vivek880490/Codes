class Solution {
    public int deleteAndEarn(int[] nums) {
        
        int inc = 0;
        int exc = 0;
        
        int arr[] = new int [100001];
    
        for(int x:nums){
            arr[x]++;
            
        }
        
        for(int i=0;i<arr.length;i++){
            int in = exc+arr[i]*i;
            int ex = Math.max(inc,exc);
            
            inc = in;
            exc = ex;
        }
        
        return Math.max(inc,exc);
        
    }
}