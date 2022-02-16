class Solution {
    public int maxAbsValExpr(int[] x, int[] y) {
        int res = 0, n = x.length, P[] = {-1,1};
        for (int p : P) {
            for (int q : P) {
                int smallest = p * x[0] + q * y[0] + 0;
                for (int i = 1; i < n; ++i) {
                    int cur = p * x[i] + q * y[i] + i;
                    res = Math.max(res, cur - smallest);
                    smallest = Math.min(smallest, cur);
                }
            }
        }
        return res;
    }
}