class Solution {
    public int arrangeCoins(int n) {
        
        long l = 0;
        long h = n;
        int count = 0;
        while(l <= h){
            long mid = l + (h-l)/2;
            
            if(n >= ((mid*(mid+1))/2)){
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }
        return (int)(l-1);
        
    }
}