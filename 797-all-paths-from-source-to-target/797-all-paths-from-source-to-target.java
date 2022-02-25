class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer>cur=new ArrayList<>();
        cur.add(0);
        dfs(0,graph.length-1,graph,cur,res);
        return res;
    }
    
    void dfs(int start,int end,int graph[][],List<Integer>cur, List<List<Integer>> res){
        if(start==end){
            res.add(new ArrayList<>(cur));
            return;
        }
        
        for(int g:graph[start]){
            cur.add(g);
            dfs(g,end,graph,cur,res);
            cur.remove(cur.size()-1);
        }
    }
}