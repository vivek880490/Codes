class Solution {
    public boolean checkValid(int[][] matrix) {
        int n  = matrix.length;
        for(int i=0; i<matrix.length; i++){
            boolean rvis[] = new boolean[n+1];
            boolean cvis[] = new boolean[n+1];
            
            for(int j=0; j<matrix[0].length; j++){
                
                int rval = matrix[i][j];
                int cval = matrix[j][i];
                
                if(rvis[rval] == true || cvis[cval] == true){
                    return false;
                    
                }
                rvis[rval] = true;
                cvis[cval] = true;
            }
            
        }
        return true;
    }
}