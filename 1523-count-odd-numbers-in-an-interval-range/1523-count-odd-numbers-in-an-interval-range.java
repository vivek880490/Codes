class Solution {
    public int countOdds(int l, int h) {
        
        int nums = h-l+1;
        
        if(l%2!=0 && h%2!=0){
            return nums/2+1;
        }
        
        return nums/2;
        
    }
}