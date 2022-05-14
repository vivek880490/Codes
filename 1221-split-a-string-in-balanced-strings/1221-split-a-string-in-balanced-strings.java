class Solution {
    public int balancedStringSplit(String s) {
        
        int count = 0;
        int var = 0;
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch == 'L'){
                var++;
            }
            else{
                var--;
            }
            if(var == 0){
                count++;
            }
        }
        return count;
    }
}