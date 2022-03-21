class Solution {
    public List<Integer> partitionLabels(String s) {
        
        List<Integer> al = new ArrayList<>();
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            map.put(ch,i);
        }
        
        int l = -1;
        int h = 0;
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            h = Math.max(h, map.get(ch));
            
            if(i == h){
                al.add(h-l);
                l = h;
            }
            
            
        }
        
        return al;
    }
}