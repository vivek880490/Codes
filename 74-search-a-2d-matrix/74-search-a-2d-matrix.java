class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int r = 0;
        int c = n-1;
        
        while(r < m && c >= 0){
            int mid = matrix[r][c];
            if(mid == target) return true;
            if(target > mid){
                r++;
            }
            else if(target < mid){
                c--;
            }
        }
        return false;
    }
}