class Solution {
    public void setZeroes(int[][] matrix) {
         int m=matrix.length;
        int n=matrix[0].length;
        
   ArrayList<int []>al=new ArrayList<>();
       
         
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                
                if(matrix[i][j]==0){
                    al.add(new int[]{i,j});
                }
            }
        }
       
        
     
                
              for(int a[]:al){
                  
                  
                   
                    int r=a[0];
                    int c=a[1];
                    
                    for(int y=0;y<n;y++){
                        matrix[r][y]=0;
                    }
                    
                    for(int y=0;y<m;y++){
                        matrix[y][c]=0;
                    }
                }
                
            
        
        
    }
}