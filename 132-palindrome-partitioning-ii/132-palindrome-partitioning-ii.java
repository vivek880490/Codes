class Solution {
    public int minCut(String s) {
        
        Integer qb[][] = new Integer[s.length()][s.length()];
        
        return solve(s, 0, s.length()-1,qb);
        
    }
    
    boolean ispalindrome(String s, int i, int j){
        while(i<j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    
    int solve(String s, int i, int j, Integer qb[][]){
        
        if(i>=j) return 0;
        
        if(ispalindrome(s,i,j)==true) return 0;
        
        if(qb[i][j] != null) return qb[i][j];
        
        int min = Integer.MAX_VALUE;
        
       
        for(int k = i; k <= j-1; k++){
            //agar ek side pakindrome hai tabhi doosre side ko check karenge kyunki sara cut plaindrome chahiye
            if(ispalindrome(s,i,k)){
                int temp = 1+solve(s,k+1,j,qb);
                min = Math.min(temp, min);
            }
            
            
            
        }
        
        return qb[i][j]=min;
    }
}