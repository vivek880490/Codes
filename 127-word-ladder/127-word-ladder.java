class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        if(wordList.contains(endWord)==false) return 0;
        
        HashMap<String,Boolean>map=new HashMap<>();
        
        for(int i=0;i<wordList.size();i++){
            String word=wordList.get(i);
            map.put(word,false);
        }
        
        Queue<String>q=new LinkedList<>();
        int ans=1;
        q.add(beginWord);
        map.put(beginWord,true);
        
        while(q.size()>0){
            int size=q.size();
            
            for(int i=0;i<size;i++){
                
                String w=q.poll();
                
                if(w.equals(endWord)) return ans;
                solve(w,q,map);
            }
            ans++;
        }
        
        return 0;
    }
    
    void solve(String w,Queue<String>q,HashMap<String,Boolean>map){
        
        for(int i=0;i<w.length();i++){
            char ch[]=w.toCharArray();
            
            for(int j=0;j<26;j++){
                ch[i]=(char)('a'+j);
                
                String word=String.valueOf(ch);
                
                if(map.containsKey(word) && map.get(word)==false){
                    q.add(word);
                    map.put(word,true);
                }
            }
        }
    }
    
    
    
}