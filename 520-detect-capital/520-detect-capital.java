class Solution {
    public boolean detectCapitalUse(String word) {
        
        int count = 0;
        int countb = 0;
        
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            int a = ch;
            
            if(a >= 65 && a<=90){
                count++;
            }
            else if(a >= 97 && a <= 122){
                countb++;
            }
        }
        System.out.println(count +" "+countb);
        
        if(countb == word.length()) return true;
        
        if(count == 1){
            char ch = word.charAt(0);
            
            int a = ch;
            
            if(a >= 65 && a<=90) return true;
            
            return false;
        }
        
        else{
            
            if(count == word.length()) return true;
            return false;
        }
        
        
        
    }
}