class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min = Integer.MAX_VALUE;
        int index=-1;
        int i=0;
        for(int point[]:points){
            if(point[0]==x || point[1]==y){
                int dist=Math.abs(point[0]-x)+Math.abs(point[1]-y);
                if(dist<min){
                    min=dist;
                    index=i;
                }
            }
            i++;
            
        }
        return index;
        
        
        
    }
}