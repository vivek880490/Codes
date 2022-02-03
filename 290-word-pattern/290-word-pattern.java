class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        
        
       HashMap<Character,String>map=new HashMap<>();
        //HashMap<String,Boolean>used=new HashMap<>();
        
        String words[]=s.split(" ");
        
        if(pattern.length()!=words.length) return false;
        
        
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
          if(map.containsKey(ch)==true){
              String word=map.get(ch);
              if(word.equals(words[i])==false){
                  return false;
              }
          }
            else{
                if(map.containsValue(words[i])){
                    return false;
                }
                map.put(ch,words[i]);
            }
        }
        
       return true;
        
    }
}