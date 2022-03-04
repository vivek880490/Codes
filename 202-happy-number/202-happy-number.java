class Solution {
    public boolean isHappy(int n) {
        
        int slow = n;
        int fast = solve(n);
        
        while(slow != fast){
            slow = solve(slow);
            fast = solve(solve(fast));
            
        }
        return slow==1;
        
        
    }
    
    int solve(int n){
        int ans = 0;
        while(n!=0){
            int digit = n%10;
            ans+= digit*digit;
            n=n/10;
            
        }
        return ans;
    }
}