class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int[] indegrees = new int[graph.length];
        Map<Integer, Set<Integer>> adjMap = new HashMap<>();
        for (int i = 0; i < graph.length; i++) {
            for (int neighbor : graph[i]) {
                adjMap.putIfAbsent(neighbor, new HashSet<Integer>());
                adjMap.get(neighbor).add(i);
                indegrees[i]++;
            }
        }
        
        Set<Integer> result = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < indegrees.length; i++) {
            if(indegrees[i] == 0) { // these are all the roots that don't have children pointing to them.
                result.add(i);
                q.add(i);
            }
        }
        
        while(!q.isEmpty()) {
            int e = q.remove();
            result.add(e);
            for(int child: adjMap.getOrDefault(e, new HashSet<>())) {
                indegrees[child]--;
                if(indegrees[child] == 0) {
                    q.add(child);
                }
            }
        }
        List<Integer> list = new ArrayList<Integer>(result);
        Collections.sort(list);
        return list;
    }
}