class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        Integer qb[][][] = new Integer[m+1][n+1][strs.length+1];
        return solve(strs, m , n, 0, qb);
    }
    
    int solve(String strs[], int m , int n, int i, Integer qb[][][]){
        if(i == strs.length || (m+n) == 0) return 0;
        
        if(qb[m][n][i] != null) return qb[m][n][i];
        
        String s = strs[i];
        int count = 0;
        int skip = 0;
        int zero = countz(s);
        int one = s.length() - zero;
        
        if(m >= zero && n >= one){
            count = 1 + solve(strs, m-zero, n-one, i+1, qb);
        }
        skip = solve(strs, m, n, i+1, qb);
        
        
        return qb[m][n][i] = Math.max(count, skip);
        
        
    }
    
    int countz(String s){
        int count = 0;
        for(char c : s.toCharArray()){
            if(c == '0'){
                count++;
            }
            
            
        }
        return count;
    }
}