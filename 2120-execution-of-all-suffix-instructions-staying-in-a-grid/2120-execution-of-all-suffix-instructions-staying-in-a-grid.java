class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int ans[] = new int[s.length()];
        
        for(int i=0; i<s.length(); i++){
            ans[i] = solve(n,startPos,s.substring(i));
        }
        
        return ans;
    }
    
    int solve(int n, int startpos[], String s){
        int count = 0;
        int x =  startpos[0];
        int y =  startpos[1];
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch == 'R'){
                y = y+1;
               if(y > n-1) break;
                 count++;
            }
             else if(ch == 'L'){
                y = y-1;
               
                if(y < 0) break;
                  count++;
            }
             else if(ch == 'U'){
                x = x-1;
                
                if(x < 0) break;
                 count++;
            }
             else if(ch == 'D'){
                x = x+1;
                
                if(x > n-1) break;
                 count++;
            }
        }
        
        return count;
    }
}