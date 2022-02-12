class Solution {
    public void rotate(int[][] matrix) {
        
        
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        for(int i=0;i<matrix.length;i++){
            reverse(matrix[i]);
        }
        
        
    }
    
    void reverse(int arr[]){
        
        int l=0;
        int h=arr.length-1;
        
        while(l<h){
            int temp=arr[l];
            arr[l]=arr[h];
            arr[h]=temp;
            l++;
            h--;
        }
    }
}