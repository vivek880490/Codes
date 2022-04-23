class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int x : deck){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        
        int ans = 0;
        for(int k : map.keySet()){
            ans = gcd(ans, map.get(k));
        }
        
        if(ans >= 2){
            return true;
        }
        return false;
        
    }
    
    int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
}