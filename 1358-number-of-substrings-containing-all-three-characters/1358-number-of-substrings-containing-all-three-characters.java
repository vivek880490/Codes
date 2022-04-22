class Solution {
    public int numberOfSubstrings(String s) {
        
        int i = 0;
        int j = 0;
        int ans = 0;
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        while(j < s.length()){
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch,0)+1);
            
            int count = map.size();
            
            if(count < 3){
                j++;
            }
            
            else if(count == 3){
                while(count >= 3){
                    ans += s.length() - j;
                char c = s.charAt(i);
                    if(map.containsKey(c)){
                        map.put(c, map.get(c)-1);
                    }
                        if(map.get(c) == 0){
                            map.remove(c);
                            count--;
                        
                    }
                    i++;
                }
                j++;
            }
        
            
            
        }
        
        return ans;
    }
}