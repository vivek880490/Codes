class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        
       int count = 0;
        
        while(left != right){
            left = left >> 1;
            right = right >> 1;
            count++;
        }
        
        while(count --> 0){
            left = left << 1;
        }
        
        return left;
    }
}