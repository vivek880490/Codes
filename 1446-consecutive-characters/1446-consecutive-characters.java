class Solution {
    public int maxPower(String s) {
        int max=0;
        
        for(int i=0;i<s.length();i++){
            
            char ch = s.charAt(i);
            
            int h = i+1;
            int  l = i+1;
            
            while(h<s.length()){
                if(s.charAt(h)==ch){
                    h++;
                }
                else{
                    break;
                }
            }
            int len = h-l+1;
            max=Math.max(max,len);
        }
        return max;
    }
}