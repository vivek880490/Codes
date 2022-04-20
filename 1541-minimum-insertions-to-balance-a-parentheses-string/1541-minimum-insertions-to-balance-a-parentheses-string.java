class Solution {
    public int minInsertions(String s) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch == '('){
                if(st.size() == 0 || st.peek() == 2){
                    st.push(2);
                }
                else{
                    st.pop();
                    st.push(2);
                    ans++;
                }
            }
            else{
                if(st.size() == 0){
                    st.push(1);
                    ans++;
                }
                else if(st.peek() == 1){
                    st.pop();
                }
                else if(st.peek() == 2){
                    st.pop();
                    st.push(1);
                }
            }
        }
        
        while(st.size() > 0){
            ans+=st.pop();
        }
        return  ans;
    }
}