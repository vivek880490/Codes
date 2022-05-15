class Solution {
    public String shiftingLetters(String s, int[] nums) {
        
        StringBuilder sb = new StringBuilder();
        long[] suffix = new long[nums.length + 1];
        for(int i=suffix.length-2; i>=0; i--){
            suffix[i] = nums[i]+suffix[i+1];
        }
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            long realShift = ((long) (ch - 'a') + suffix[i]) % 26;

            sb.append((char)('a' + realShift));
        }
        
        return sb.toString();
    }
}
// 17 14 9 