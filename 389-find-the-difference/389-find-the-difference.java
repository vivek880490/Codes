class Solution {
    public char findTheDifference(String s, String t) {
        
        char sa[]=s.toCharArray();
        char ta[]=t.toCharArray();
        
        Arrays.sort(sa);
        Arrays.sort(ta);
        
        for(int i=0;i<s.length();i++){
            if(sa[i]!=ta[i]){
                return ta[i];
            }
        }
        return ta[ta.length-1];
        
    }
}