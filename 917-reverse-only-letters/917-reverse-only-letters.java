class Solution {
    public String reverseOnlyLetters(String s) {
        
        int l = 0;
        int h = s.length()-1;
        
        char c[] = s.toCharArray();
        
        while(l <= h){
            char cl = s.charAt(l);
            char ch = s.charAt(h);
            
            if(Character.isAlphabetic(cl) == true && Character.isAlphabetic(ch) == true){
                swap(c, l, h);
                l++;
                h--;
            }
            else if(Character.isAlphabetic(cl) == false){
                l++;
            }
            else if(Character.isAlphabetic(ch) == false){
                h--;
            }
        }
        
        return String.valueOf(c);
    }
    
    void swap(char c[], int l, int h){
        char temp = c[l];
        c[l] = c[h];
        c[h] = temp;
    }
}