class Solution {
    public int[] plusOne(int[] digits) {
        
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
            }
        
        int newint[] = new int[digits.length+1];
        
        newint[0] = 1;
        
        return newint;
        
    }
}