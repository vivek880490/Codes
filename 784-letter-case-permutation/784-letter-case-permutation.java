class Solution {
    public List<String> letterCasePermutation(String s) {
        
        List<String> res = new ArrayList<>();
        
        String in = s;
        String op = "";
        
        solve(in, op, res);
        
        return res;
    
    }
    
    void solve(String in, String op, List<String> res){
        if(in.length() == 0) {
            res.add(op); 
            return;
        }
        
        char ch = in.charAt(0);
        
        String op1 = op;
        String op2 = op;
        
        if(Character.isDigit(ch) == false)
        {
        op1 += Character.toLowerCase(ch);
        op2 += Character.toUpperCase(ch);
        
        in = in.substring(1);
        
        solve(in, op1, res);
        solve(in, op2, res);
            return;
        }
        if(Character.isDigit(ch) == true){
            op1 += ch;
            in = in.substring(1);
            solve(in, op1, res);
            return;
        }
        
        return;
                
        
    }
}