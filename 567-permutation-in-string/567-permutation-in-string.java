class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length()>s2.length()) return false;
        char arr[]=new char[26];
        
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            arr[ch-'a']++;
        }
        
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            arr[ch-'a']--;
            
            if(i-s1.length()>=0){
                arr[s2.charAt(i-s1.length())-'a']++;
                
            }
            if(countzero(arr)==true){
                return true;
            }
        }
        return false;
        
        
        
        
    }
    
    boolean countzero(char arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0) return false;
        }
        return true;
    }
}