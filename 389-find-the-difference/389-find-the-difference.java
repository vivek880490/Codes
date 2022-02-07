class Solution {
    public char findTheDifference(String s, String t) {
        
        HashMap<Character,Integer>maps=new HashMap<>();
        HashMap<Character,Integer>mapt=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            maps.put(ch,maps.getOrDefault(ch,0)+1);
        }
        
         for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            mapt.put(ch,mapt.getOrDefault(ch,0)+1);
        }
        
        
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            
            if(maps.containsKey(ch)){
               if(maps.get(ch)<mapt.get(ch)){
                   return ch;
               }
            }
            else{
            if(maps.get(ch)==null){
                return ch;
            }
            }
        }
        return 0;
    }
}