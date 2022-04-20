class Solution {
    public int minSwaps(String s) {
        
        int close = 0;
        int max = 0;
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch == '['){
               close--; 
            }
            else{
                close++;
            }
            
            max = Math.max(max, close);
        }
        
        return (max+1)/2;
    }
}