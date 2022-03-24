class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<HashMap<Character, Integer>,List<String>> bmap = new HashMap<>();
        
        for(String s : strs){
            HashMap<Character,Integer> map = new HashMap<>();
            
            for(char c : s.toCharArray()){
                map.put(c, map.getOrDefault(c,0)+1);
            }
            
            if(bmap.containsKey(map) == false){
                List<String> al = new ArrayList<>();
                al.add(s);
                bmap.put(map, al);
            }
            else{
                List<String> temp = bmap.get(map);
                
                temp.add(s);
            }
        }
        List<List<String>>ans=new ArrayList<>();
        
        for(List<String>temp:bmap.values()){
            ans.add(temp);
        }
        return ans;
        
    }
}