class Solution {
    public int countGoodSubstrings(String s) {
        
        if(s.length() < 3 ) return 0;
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        int i = 0;
        int j = 0;
        int count = 0;
        
        while(j < s.length()){
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch,0)+1);
            
            if(j-i+1 == 3){
                if(map.size() == 3)
                {
                count++;
                }
                
                if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i), map.get(s.charAt(i))-1);
                    if(map.get(s.charAt(i)) == 0) map.remove(s.charAt(i));
                }
                //map.put(s.charAt(j), map.getOrDefault(s.charAt(j),0)+1);
                i++;
            }
            
            j++;
        }
        return count;
        
    }
}