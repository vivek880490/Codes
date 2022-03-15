class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
        String str = s+s;
        
        return str.substring(1, str.length()-1).contains(s);
        
        // a baab a
        // a bababa b
    }
}