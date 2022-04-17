class Solution {
    public int characterReplacement(String s, int k) {
        
        int freq[] = new int[26];
        
        int i = 0;
        int j = 0;
        int max = 0;
        int ans = 0;
        while(j < s.length()){
            char ch = s.charAt(j);
            freq[ch-'A']++;
            max = Math.max(max, freq[ch-'A']);
            
            while(j-i+1 - max > k){
                freq[s.charAt(i)-'A']--;
                i++;
            }
            ans = Math.max(ans, j-i+1);
            j++;
        }
        return ans;
        
    }
}