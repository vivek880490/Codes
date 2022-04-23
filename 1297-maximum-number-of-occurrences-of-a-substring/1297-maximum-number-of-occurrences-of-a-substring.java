class Solution {
    public int maxFreq(String s, int k, int min, int max) {
        
        int i = 0;
        int j = 0;
        HashMap<String,Integer> ans = new HashMap<>();
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        while(j < s.length()){
            
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch,0)+1);
            
            while(j-i+1 > min){
                char c = s.charAt(i);
                if(map.containsKey(c)){
                    map.put(c, map.get(c)-1);
                }
                if(map.get(c) == 0){
                    map.remove(c);
                }
                i++;   
            }
            
            if(map.size() <= k && j-i+1 >= min ){
                ans.put(s.substring(i, j+1), ans.getOrDefault(s.substring(i, j+1),0)+1);

            }
                            j++;
        }
        
        int res = 0;
        for(int x : ans.values()){
            res = Math.max(res,x);
        }
        
        return res;
    }
}