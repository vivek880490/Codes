class Solution {
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> Edges) {
        
       ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      graph.add(new ArrayList<>());
    }
    for (List<Integer> list : Edges) {
      int u = list.get(0);
      int v = list.get(1);
      graph.get(u).add(v);
      graph.get(v).add(u);
    }
    time = 0;
    int[] parent = new int[n];
    parent[0] = -1;
    List<List<Integer>> ans = new ArrayList<>();
    AP_Bridges(graph, new int[n], new int[n], parent, ans, new boolean[n], 0);
    return ans;
    }
  static int time;

  private static void AP_Bridges(ArrayList<ArrayList<Integer>> graph, int[] disc, int[] low, int[] parent,List<List<Integer>> ans, boolean[] visited, int src) {
    disc[src] = low[src] = ++time;
    visited[src] = true;
    for (int e = 0; e < graph.get(src).size(); e++) {
      int nbr = graph.get(src).get(e);
      if (parent[src] == nbr) {
        continue;
      } else if (visited[nbr] == true) {
        low[src] = Math.min(low[src], disc[nbr]);
      } else {
        parent[nbr] = src;
        AP_Bridges(graph, disc, low, parent, ans, visited, nbr);
        low[src] = Math.min(low[src], low[nbr]);
        if (low[nbr] > disc[src]) {
          List<Integer> temp = new ArrayList<>();
          temp.add(src);
          temp.add(nbr);
          ans.add(temp);
        }

      }
    }
  }
    
}