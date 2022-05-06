class Solution {
    public String removeDuplicates(String s, int k) {
        
        Stack<Character> st = new Stack<>();
        Stack<Integer> count = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
          if(st.size() > 0 && st.peek() == ch){
              count.push(count.peek()+1);
          }
            else{
                count.push(1);
            }
            
            st.push(ch);
            int n = k;
            if(count.peek() == k){
                while(n -- >0){
                    st.pop();
                    count.pop();
                }
            }
        }
        
        
        
        StringBuilder sb = new StringBuilder();
        
        while(st.size() > 0){
            sb.append(st.pop());
        }
        
        sb.reverse();
        
        return sb.toString();
    }
}