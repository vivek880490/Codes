class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        int n =s.length();
      HashMap<Character,Integer> map =new HashMap<>();
      int mLen = -1;
      int i = 0;
      int j = 0;
      while(j < n){
          char chj = s.charAt(j); 
          map.put(chj,map.getOrDefault(chj,0)+1);
          if( map.size() > j-i+1) j++;
          
          else if(map.size() == j-i+1){
              mLen = Math.max(mLen , j-i+1);
              j++;
          }
          else if(map.size() < j-i+1){
              while(map.size() < j-i+1){
                  char ch = s.charAt(i);
                  map.put(ch , map.get(ch) - 1);
                  if(map.get(ch) == 0) map.remove(ch);
                  i++;
              }
              j++;
          }
      }
      return mLen;
    }
}