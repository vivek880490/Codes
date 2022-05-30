class Solution {
    public int minMutation(String beginWord, String endWord, String[] wordList) {
        if(wordList.length == 0) return -1;
        
        HashMap<String,Boolean>map=new HashMap<>();
        
        for(int i=0;i<wordList.length;i++){
            String word=wordList[i];
            map.put(word,false);
        }
        boolean found = false;
        Queue<String>q=new LinkedList<>();
        int ans=0;
        q.add(beginWord);
        map.put(beginWord,true);
        
        while(q.size()>0){
            int size=q.size();
            
            for(int i=0;i<size;i++){
                
                String w=q.poll();
                
                if(w.equals(endWord)) {
                    found=true;
                    return ans;
                }
                solve(w,q,map);
            }
            ans++;
        }
        
        return found==true?ans:-1;
    }
    
    void solve(String w,Queue<String>q,HashMap<String,Boolean>map){
        char arr[]={'A','C','G','T'};
        for(int i=0;i<w.length();i++){
            char ch[]=w.toCharArray();
            
            for(int j=0;j<4;j++){
                ch[i]=arr[j];
                
                String word=String.valueOf(ch);
                
                if(map.containsKey(word) && map.get(word)==false){
                    q.add(word);
                    map.put(word,true);
                }
            }
        }
    }
}