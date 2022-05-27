class Solution {
    public int networkDelayTime(int[][] times, int N, int K) {
    int[] disTo = new int[N];
    Arrays.fill(disTo, Integer.MAX_VALUE);
    disTo[K - 1] = 0;
    for (int i = 1; i < N; i++) {
        for (int[] edge : times) {
            int u = edge[0] - 1, v = edge[1] - 1, w = edge[2];
            if(disTo[u] == Integer.MAX_VALUE) continue;
            disTo[v] = Math.min(disTo[v], disTo[u] + w);
        }
    }
    int res = Integer.MIN_VALUE;
    for (int i: disTo) {
        res = Math.max(i, res);
    }
    return res == Integer.MAX_VALUE ? -1 : res;
}
}