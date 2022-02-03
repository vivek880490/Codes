class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        
        
       HashMap<Character,String>map=new HashMap<>();
        HashMap<String,Boolean>used=new HashMap<>();
        
        String words[]=s.split(" ");
        
        if(pattern.length()!=words.length) return false;
        
        
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
           if(map.containsKey(ch)==false){
               if(used.containsKey(words[i])==true){
                   return false;
               }
               else{
                   used.put(words[i],true);
                   map.put(ch,words[i]);
               }
               
           }
            else{
                String word=map.get(ch);
                if(word.equals(words[i])==false){
                    return false;
                }
            }
        }
        
       return true;
        
    }
}