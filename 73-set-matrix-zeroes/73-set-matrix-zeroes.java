class Solution {
    public void setZeroes(int[][] matrix) {
        
        ArrayList<int []>al=new ArrayList<>();
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    al.add(new int[]{i,j});
                }
            }
        }
        
        for(int arr[]:al){
            int r=arr[0];
            int c=arr[1];
            
            for(int i=0;i<matrix.length;i++){
                matrix[i][c]=0;
            }
                for(int j=0;j<matrix[0].length;j++){
                    matrix[r][j]=0;
                }
            }
        }
    }
