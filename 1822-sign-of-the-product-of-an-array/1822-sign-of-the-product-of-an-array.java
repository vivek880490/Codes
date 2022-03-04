class Solution {
    public int arraySign(int[] nums) {
        
        int count = 0;
        
        for(int x:nums){
            if(x<0){
                count++;
            }
            if(x==0) return 0;
        }
        
        return (count%2==1?-1:1); 
        
    }
}