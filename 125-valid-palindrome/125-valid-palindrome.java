class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(Character.isAlphabetic(ch) ){
              char c = Character.toLowerCase(ch);
                sb.append(c);
            }
            if(Character.isDigit(ch)){
                sb.append(ch);
            }
        }
        System.out.println(sb.toString() + " ");
        return solve(sb.toString());
    }
    
    boolean solve(String s){
        int i=0;
        int j = s.length()-1;
        
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }
}