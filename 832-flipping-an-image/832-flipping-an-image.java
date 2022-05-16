class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int x[] : image){
            flip(x);
        }
        
        return image;
    }
    
    void flip(int arr[]){
        int i = 0;
        int j = arr.length-1;
        
        while(i <= j){
            int temp = arr[i]==0?1:0;
            arr[i] = arr[j]==0?1:0;
            arr[j] = temp;
            i++;
            j--;
        }
    }
}