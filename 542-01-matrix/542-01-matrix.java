class Solution {
    int dirs[][]={{0,1},{0,-1},{-1,0},{1,0}};
    public int[][] updateMatrix(int[][] mat) {
        
        Queue<int []>q=new LinkedList<>();
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    q.add(new int[]{i,j});
                    
                }
                else{
                    mat[i][j]=-1;
                }
            }
        }
        
        while(q.size()>0){
            int rem[]=q.poll();
            
            for(int i=0;i<4;i++){
                int rd=rem[0]+dirs[i][0];
                int cd=rem[1]+dirs[i][1];
                
                if(rd>=0 && cd>=0 && rd<mat.length && cd<mat[0].length && mat[rd][cd]<0){
                    
                    mat[rd][cd]=mat[rem[0]][rem[1]]+1;
                    q.add(new int[]{rd,cd});
                }
            }
        }
        return mat;
        
    }
}