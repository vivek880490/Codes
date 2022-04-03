class Solution {
    public int minDistance(String word1, String word2) {
        
        int n = word1.length();
        int m = word2.length();
        Integer qb[][] = new Integer[n][m];
        return solve(n-1, m-1, word1, word2,qb);
    }
    
    int solve(int i, int j, String word1, String word2, Integer qb[][]){
        //empty string se banane ke liye bacha hua string length jitna remove ya add karna hoga.
        if(i < 0) return j+1;
        if(j < 0) return i+1;
        
        if(qb[i][j] != null) return qb[i][j];
        
        if(word1.charAt(i) == word2.charAt(j)){
            return qb[i][j] = solve(i-1, j-1, word1, word2,qb);
        }
        else{
            int insert = solve(i-1, j, word1, word2,qb);
            int delete = solve(i, j-1, word1, word2,qb);
            int replace = solve(i-1, j-1, word1, word2,qb);
            return qb[i][j] = 1 + Math.min(insert,Math.min(delete, replace));
        }
        
    }
}