class Solution {
    public int minDeletions(String s) {
        int freq[] = new int[26];
        
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int x : freq){
            while(x !=0 && set.contains(x)){
                x--;
                count++;
            }
            set.add(x);
        }
        
        return count;
    }
}