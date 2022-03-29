class Solution {
    public String reverseVowels(String s) {
        char ch[] = s.toCharArray();
        int l = 0;
        int h = ch.length-1;
        
        while(l < h){
            if(isVowel(ch[l]) && isVowel(ch[h])){
                char temp = ch[l];
                ch[l] = ch[h];
                ch[h] = temp;
                l++;
                h--;
            }
            if(isVowel(ch[l])==false) l++;
            if(isVowel(ch[h])==false) h--;
        }
        
        return String.valueOf(ch);
    
        
    }
    
    public  boolean isVowel(char c) {
  return "AEIOUaeiou".indexOf(c) != -1;
}
}