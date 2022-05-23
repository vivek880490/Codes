class Solution {
    public int countConsistentStrings(String s, String[] words) {
        
        HashSet<Character> set = new HashSet<>();
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            set.add(ch);
        }
        
        int count = 0;
        
        for(String x : words){
            for(int i=0; i<x.length(); i++){
                char ch = x.charAt(i);
                if(set.contains(ch) == false) break;
                
                if(i == x.length()-1) count++;
            }
        }
        
        return count;
    }
}