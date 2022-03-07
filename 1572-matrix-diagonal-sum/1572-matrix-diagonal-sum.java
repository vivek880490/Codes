class Solution {
    public int diagonalSum(int[][] mat) {
        
        int r = mat.length;
        int c = mat[0].length;
        
        int sum = 0;
        
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(i==j){
                   sum+=(mat[i][j]);
                }
            }
        }
        
            for(int i=0; i<r; i++){
            for(int j=c-1-i; j>=0; j--){
                if(i!=j){
                sum+=(mat[i][j]);
                }
                break;
            }
        }
        
       
        return sum;
    }
    
}