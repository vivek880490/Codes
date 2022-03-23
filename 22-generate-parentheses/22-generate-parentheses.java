class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> res = new ArrayList<>();
        
        int open = n;
        int close = n;
        String op = "";
        
        solve(open, close, op, res);
        return res;
        
    }
    
    void solve(int open, int close, String op, List<String>al){
        if(open == 0 && close == 0){
            al.add(op);
            return;
        }
        
        if(open != 0){
            String op1 = op;
            op1 += "(";
            
            solve(open-1, close, op1, al);
            
        }
        if(open < close){
            String op2 = op;
            op2 += ")";
            
            solve(open, close-1, op2, al);
            return;
        }
        
    }
}