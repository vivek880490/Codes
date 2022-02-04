class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<HashMap<Character,Integer>,ArrayList<String>>bmap=new HashMap<>();
        
        for(String str:strs){
            HashMap<Character,Integer>map=new HashMap<>();
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            
            if(bmap.containsKey(map)==false){
                ArrayList<String>al=new ArrayList<>();
                al.add(str);
                bmap.put(map,al);
            }
            else{
                ArrayList<String>al=bmap.get(map);
                al.add(str);
            }
        }
        
        List<List<String>>ans=new ArrayList<>();
        
        for(ArrayList<String>temp:bmap.values()){
            ans.add(temp);
        }
        return ans;
        
    }
}