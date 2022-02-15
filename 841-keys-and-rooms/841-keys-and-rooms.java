class Solution {
    int count=0;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        boolean[] visited=new boolean[rooms.size()];
        for(int i=0;i<rooms.size();i++){
            if(visited[i]==false){
        dfs(0,rooms,visited);
            count++;
            }
            
                
    }
        if(count>1) return false;
return true;    
    }
    
    void dfs(int u,List<List<Integer>> rooms,boolean[] visited){
        
        visited[u]=true;
        
        for(int v:rooms.get(u)){
            if(!visited[v]){
                 dfs(v,rooms,visited);
            }
            
        } 
    }
}