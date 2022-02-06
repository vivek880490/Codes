class Solution {
    public class Pair implements Comparable<Pair>{
        int r,c,maxwt;
        Pair(int r,int c,int maxwt){
            this.r=r;
            this.c=c;
            this.maxwt=maxwt;
        }
        public int compareTo(Pair o){
            return this.maxwt-o.maxwt;
        }
    }
    static int[][] dirs={{-1,0},{1,0},{0,-1},{0,1}};
    public int swimInWater(int[][] grid) {
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        pq.add(new Pair(0,0,grid[0][0]));
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        while(true){
            Pair rem=pq.remove();
            
            if(rem.r==grid.length-1 && rem.c==grid.length-1){
                return rem.maxwt;
            }
            if(visited[rem.r][rem.c]==true){
                continue;
            }
            visited[rem.r][rem.c]=true;
            
            for(int i=0;i<dirs.length;i++){
                int r2=rem.r+dirs[i][0];
                int c2=rem.c+dirs[i][1];
                
                if(r2<0 || r2>=grid.length || c2<0 || c2>=grid[0].length || visited[r2][c2]==true){
                    continue;
                }
                pq.add(new Pair(r2,c2,Math.max(rem.maxwt,grid[r2][c2])));
            }
        }
    }
}