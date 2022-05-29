// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] wordList = new String[n];
            for(int i = 0; i < n; i++){
                wordList[i] = br.readLine().trim();
            }
            String startWord, targetWord;
            startWord = br.readLine().trim();
            targetWord = br.readLine().trim();
            Solution obj = new Solution();
            int ans = obj.wordLadderLength(startWord, targetWord, wordList);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends


class Solution
{
    public int wordLadderLength(String beginWord, String endWord, String[] wordList)
    {
        // Code here
        //if(wordList.contains(endWord)==false) return 0;
        
        HashMap<String,Boolean>map=new HashMap<>();
        
        for(int i=0;i<wordList.length;i++){
            String word=wordList[i];
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