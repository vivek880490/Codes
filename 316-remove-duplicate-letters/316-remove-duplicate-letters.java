class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character>st=new Stack<>();
        
        char c[]=s.toCharArray();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<c.length;i++){
            map.put(c[i],map.getOrDefault(c[i],0)+1);
        }
        boolean exist[]=new boolean[26];
        for(int i=0;i<c.length;i++){
            char ch=c[i];
            map.put(ch,map.get(ch)-1);
            if(exist[ch-'a']) continue;
            
            while(st.size()>0 && st.peek()>ch && map.get(st.peek())>0){
                char rem=st.pop();
                exist[rem-'a']=false;
            }
            st.push(ch);
            exist[ch-'a']=true;
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(st.size() > 0){
            sb.append(st.pop());
        }
        
        sb.reverse();
        
        return sb.toString();
        
    }
}