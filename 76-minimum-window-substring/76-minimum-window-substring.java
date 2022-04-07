class Solution {
    public String minWindow(String s, String t) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<t.length(); i++){
            
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        
        int i = 0;
        int j = 0;
        String ans = "";
        int min = Integer.MAX_VALUE;
        int count = map.size();
        
        while(j < s.length()){
            char ch = s.charAt(j);
            
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)-1);
            
            if(map.get(ch) == 0){
                count--;
            }
            }
            
            while(count == 0){
                char c = s.charAt(i);
                if(min > j-i+1){
                min = Math.min(min, j-i+1);
                ans = s.substring(i, i+j-i+1);
                
                }
                if(map.containsKey(c)){
                    map.put(c, map.get(c)+1);
                    if(map.get(c) == 1){
                        count++;
                    }
                }
                i++;
            }
            j++;
        }
        
        return ans;
    }
}