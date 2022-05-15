class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        
        HashMap<Character,List<Integer>> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                List<Integer> temp = map.get(ch);
                temp.add(i);
                map.put(ch, temp);
            }
            else{
                List<Integer> al = new ArrayList<>();
                al.add(i);
                map.put(ch,al);
            }
        }
        //System.out.println(map);
        int ans = 0;
        boolean flag = false;
        
        for(List<Integer> k: map.values()){
            if(k.size() >= 2){
                flag = true;
                int len = k.get(k.size()-1) - k.get(0)-1;
                ans = Math.max(ans, len);
            }
             //System.out.println(k);
            }
            
        
        
        if(flag == false) return -1;
        else return ans;
    }
}