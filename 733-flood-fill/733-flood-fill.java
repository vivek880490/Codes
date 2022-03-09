class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int nc) {
        
         if(image[sr][sc]==nc) return image;
        
        int old = image[sr][sc];
        
        
        Queue<int[]> q = new LinkedList<>();
        
        q.add(new int[]{sr,sc});
        
        image[sr][sc] = nc;
        
        int dirs[][] = {{0,1},{1,0},{0,-1},{-1,0}};
        
        while(q.size()>0){
            int rem []= q.poll();
            
            for(int i=0; i<4; i++){
                
                int dx = dirs[i][0]+rem[0];
                int dy = dirs[i][1]+rem[1];
                
                if(dx<0 || dy<0 || dx>=image.length || dy>=image[0].length || image[dx][dy]!=old ) continue;
                
                image[dx][dy] = nc;
                
                q.add(new int[]{dx,dy});
                
            }
        }
        
        return image;
        
    }
    
    
}