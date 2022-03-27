class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        Integer qb[][] = new Integer[201][201];
        return solve(triangle, 0, 0, qb);
    }
    
    int solve(List<List<Integer>> triangle, int r, int c, Integer qb[][]){
        
        List<Integer> row = triangle.get(r);
        
        if(r == triangle.size()-1){
            return row.get(c);
        }
        
        if(qb[r][c] != null) return qb[r][c];
        
        int temp = row.get(c);
        
        int left = solve(triangle, r+1, c, qb);
        int right = solve(triangle, r+1, c+1, qb);
        
        return qb[r][c] = temp + Math.min(left, right);
    }
}