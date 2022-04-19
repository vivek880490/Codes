class Solution {
    public int chalkReplacer(int[] chalk, int s) {
         long k = s;
        long prefix[] = new long[chalk.length];
        
        prefix[0] = chalk[0];
        
        for(int i=1; i<chalk.length; i++){
            prefix[i] = chalk[i] + prefix[i-1];
        }
        
        if(prefix[prefix.length-1] <= k){
            k = k%prefix[prefix.length-1];
        }
        
        if(k == 0) return 0;
        
        int l = 0;
        int h = chalk.length-1;
        
        while(l <= h){
            int mid = l + (h-l)/2;
            
            if(k - prefix[mid] == 0) return mid+1;
            
            else if(k - prefix[mid] < 0) h = mid-1;
            else l = mid+1;
        }
        
        return l;
    }
}