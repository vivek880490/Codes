class Solution {
    public String findDifferentBinaryString(String[] nums) {
        
        int n = nums.length;
        
        char[] ans = new char[n];
        int i = 0;
        for(String x : nums){
            ans[i] = x.charAt(i)=='0'?'1':'0';
            i++;
        }
        
        return String.valueOf(ans);
    }
}