class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
        for(int i = 0; i < 4; i++){
            rotate(mat);
            if(check(mat,target)){
                return true;
            }
        }
        return false;
    }
    public boolean check(int[][] a,int[][] b){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < b.length; j++){
                if(a[i][j] != b[i][j]){
                    return false;
                }
            }
        }
        return true;
        
    }
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