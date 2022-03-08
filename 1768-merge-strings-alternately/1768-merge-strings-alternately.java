class Solution {
    public String mergeAlternately(String s1, String s2) {
        
        int i = 0;
        
        StringBuilder sb = new StringBuilder();
        
        while(i < s1.length() && i < s2.length()){
            sb.append(s1.charAt(i));
            sb.append(s2.charAt(i));
            i++;
        }
        
        while(i < s1.length()){
            sb.append(s1.charAt(i));
            i++;
        }
        
          while(i < s2.length()){
            sb.append(s2.charAt(i));
            i++;
        }
        
        return sb.toString();
        
    }
}