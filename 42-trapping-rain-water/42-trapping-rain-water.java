class Solution {
    public int trap(int[] height) {
        
        
        int n = height.length;
        
        int lel[] = new int[n];
        int ler[] = new int[n];
        
        lel[0] = height[0];
        ler[n-1] = height[n-1];
        
        for(int i=1; i<n; i++){
            lel[i] = Math.max(lel[i-1],height[i]);
        }
        
         for(int i=n-2; i>=0; i--){
            ler[i] = Math.max(ler[i+1],height[i]);
        }
        
        int mine[] = new int[n];
        for(int i=0; i<n; i++){
            mine[i] =  Math.min(lel[i], ler[i]);
        }
        
        int heigh[] = new int[n];
        
        for(int i=0; i<n; i++){
            heigh[i] = mine[i] - height[i];
        }
        
        int max = 0;
        for(int i=0; i<n; i++){
            max+=heigh[i];
        }
        
        return max;
        
    }
}