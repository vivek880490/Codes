class Solution {
     Map<String,Boolean>map=new HashMap<>();
    public boolean wordBreak(String s, List<String> word) {
        
        // recursion se tle isiliye memoization kar denge hashmap ka use karke
        
       
        
        if(word.contains(s)) return true;
        if(map.containsKey(s)) return map.get(s);
        for(int i=1;i<=s.length();i++){
            
            String left=s.substring(0,i);
            
            if(word.contains(left) && wordBreak(s.substring(i),word)) {
                map.put(s,true);
                return true;
            }
        }
        map.put(s,false);
        return false;
        
    }
}