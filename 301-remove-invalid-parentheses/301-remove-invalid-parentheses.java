class Solution {
    public List<String> removeInvalidParentheses(String s) {
        
        List<String>ans = new ArrayList<>();
        
        int removal = minrem(s);
        HashSet<String> set = new HashSet<>();
        
        solve(s, removal, ans, set);
        return ans;
        
        
        
    }
    
    int minrem(String s){
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch == '('){
                st.push(ch);
            }
            else if(ch == ')'){
                if(st.size() == 0){
                    st.push(ch);
                }
                else if(st.peek() == ')'){
                    st.push(ch);
                }
                else if(st.peek() == '('){
                    st.pop();
                }
            }
        }
        
        return st.size();
    }
    
    void solve(String s, int removal, List<String> ans, HashSet<String>set){
       if(set.contains(s)) return;
        if(removal == 0){
            int mrem = minrem(s);
            if(mrem == 0){
                if(ans.contains(s) == false){
                    ans.add(s);
                }
            }
            return;
        }
        
        set.add(s);
        
        for(int i=0; i<s.length(); i++){
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            solve(left+right, removal-1, ans, set);
        }
    }
}