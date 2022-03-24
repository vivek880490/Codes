class Solution {
    public int numTrees(int n) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(0, 1);
        map.put(1, 1);
        
        return solve(n, map);
    }
    
    int solve(int n, HashMap<Integer, Integer> map){
        if(n == 0) return 1;
        
        if(map.containsKey(n)) return map.get(n);
        
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += solve(i-1, map) * solve(n-i, map);
            map.put(n, sum);
        }
        return sum;
    }
}