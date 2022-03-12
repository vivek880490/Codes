class Solution {
    public int[][] updateMatrix(int[][] mat) {
        
        Queue<int[]> q= new LinkedList<>();
        
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j] == 0){
                    q.add(new int[]{i,j});
                }
                else{
                    mat[i][j] = -1;
                }
            }
        }
        
        int dirs[][] ={{0,1},{1,0},{0,-1},{-1,0}};
        
        while(q.size()>0){
            int rem[] = q.poll();
            
            for(int i=0; i<4; i++){
                int dx = rem[0]+dirs[i][0];
                int dy = rem[1]+dirs[i][1];
                
                if(dx>=0 && dy>=0 && dx < mat.length && dy < mat[0].length && mat[dx][dy]<0){
                    
                    mat[dx][dy]=mat[rem[0]][rem[1]]+1;
                    
                    q.add(new int[]{dx,dy});
                }
            }
        }
        return mat;
        
    }
}