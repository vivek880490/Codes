class Solution {
    public List<Integer> partitionLabels(String s) {
        
        HashMap<Character,Integer>map=new HashMap<>();
        List<Integer>al=new ArrayList<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,i);
        }
        
        int l=-1;
        int h=0;
        
       for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           h=Math.max(h,map.get(ch));
           if(h==i){
               
               int ans=(h-l);
               al.add(ans);
               l=h;
               
           }
       }
        return al;
        
        
    }
}