class Solution {
    public boolean divideArray(int[] nums) {
        
        int pairc = nums.length/2;
        
        int freq[] = new int[501];
        
        for(int x : nums){
            freq[x]++;
        }
        
        for(int x : freq){
            if(x % 2 != 0) return false;
        }
        
        return true;
    }
}