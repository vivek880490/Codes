class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        for(String word : words){
            if(matching(word, pattern)){
                ans.add(word);
            }
        }
        return ans;
    }
    
    boolean matching(String word, String pattern){
        HashMap<Character,Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        
        for(int i=0; i<pattern.length(); i++){
            char wch = word.charAt(i);
            char pch = pattern.charAt(i);
            
            if(map.containsKey(pch)){
                if(map.get(pch) != wch){
                    return false;
                }
            }
            else{
                if(set.contains(wch)){
                    return false;
                }
                map.put(pch, wch);
                set.add(wch);
            }
        }
        
        return true;
    }
}