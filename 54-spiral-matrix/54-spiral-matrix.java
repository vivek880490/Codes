class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        ArrayList<Integer>al=new ArrayList<>();
        
        int minr=0;
        int minc=0;
        
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;
        int x=0;
        int t=arr.length*arr[0].length;
        int count=0;
        
        while(minr<=maxr && minc<=maxc){
            
            for(int i=minr,j=minc;j<=maxc;j++){
                al.add(arr[i][j]);
                count++;
            }
            minr++;
            
            
            
            for(int i=minr,j=maxc;i<=maxr;i++){
                al.add(arr[i][j]);
                count++;
            }
            maxc--;
            
            
            if(minr<=maxr){
            for(int i=maxr,j=maxc;j>=minc;j--){
                al.add(arr[i][j]);
                count++;
            }
            }
            maxr--;
            
            if(minc<=maxc){

            for(int i=maxr,j=minc;i>=minr;i--){
                al.add(arr[i][j]);
                count++;
            }
            }
            minc++;
        
            
            
        }
        return al;
    }
}