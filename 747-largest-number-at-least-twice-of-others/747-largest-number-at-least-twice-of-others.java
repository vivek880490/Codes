class Solution {
    public int dominantIndex(int[] nums) {
     
        int max = 0;
        int index = -1;
        int i=0;
        for(int x : nums){
            if(x > max){
                max = x;
                index = i;
                    
            }
            i++;
        }
       
        for(int x : nums){
            if(x == max) continue;
            if(max < x*2){
                return -1;
            }
        }
    return index;
    }
    
    
}