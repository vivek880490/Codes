class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character,Character>map1=new HashMap<>();
        HashMap<Character,Character>map=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char c=t.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch)!=c){
                    return false;
                }
            }
            else{
                if(map.containsValue(c)) return false;
                map.put(ch,c);
            }
        }
        return true;
    }
}