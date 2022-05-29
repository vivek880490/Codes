class Solution {
    public boolean judgeCircle(String moves) {
        
        int u = 0;
        int l = 0;
        int r = 0;
        int d = 0;
        
        for(int i=0; i<moves.length(); i++){
            char ch = moves.charAt(i);
            if( ch == 'U'){
                u++;
            }
             else if( ch == 'D'){
                d++;
            }
            else if( ch == 'R'){
                r++;
            }
             else if( ch == 'L'){
                l++;
            }
        }
        
        return u==d && l==r;
    }
}