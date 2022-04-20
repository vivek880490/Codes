class Solution {
    public int trapRainWater(int[][] nums) {
        int m = nums.length;
        int n = nums[0].length;
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(a[2]-b[2]));
        boolean vis[][] = new boolean[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i == 0 || j == 0 || i == m-1 || j == n-1){
                    pq.add(new int[]{i,j,nums[i][j]});
                    vis[i][j] = true;
                }
            }
        }
        
        int dirs[][] = {{0,1},{1,0},{0,-1},{-1,0}};
        
        int water = 0;
        
        while(pq.size() > 0){
            int rem[] = pq.poll();
            
            for(int dir[] :dirs){
                int dx = dir[0] + rem[0];
                int dy = dir[1] + rem[1];
                
                if(dx >=0 && dy >= 0 && dx < m && dy < n && vis[dx][dy] == false){
                    water += Math.max(0, rem[2] - nums[dx][dy]);
                    
                    vis[dx][dy] = true;
                    
                    if(nums[dx][dy] >= rem[2]){
                        pq.add(new int[]{dx, dy, nums[dx][dy]});
                    }
                    else if(nums[dx][dy] < rem[2]){
                        pq.add(new int[]{dx, dy,rem[2]});
                    }
                }
            }
        }
        
        return water;
        
        }
}