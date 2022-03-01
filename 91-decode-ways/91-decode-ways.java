class Solution {
    public int numDecodings(String s) {
        
        
        int dp[]=new int[s.length()];
        
        if(s.charAt(0)=='0') return 0;
        
        dp[0]=1;
        
        for(int i=1;i<dp.length;i++){
            
            char chi=s.charAt(i);
            char ch=s.charAt(i-1);
            
            if(ch=='0' && chi=='0'){
                dp[i]=0;
                
            }
           else if(ch=='0' && chi!='0'){
               
               dp[i]=dp[i-1];
               
           }
             else if(ch!='0' && chi=='0'){
                 
                 if(ch=='1' || ch=='2'){
                     dp[i]=(i>=2?dp[i-2]:1);
                 }
                 else{
                     dp[i]=0;
                 }
               
           }
             else{
                 
                 if(Integer.parseInt(s.substring(i-1,i+1))<=26){
                     dp[i]=dp[i-1]+(i>=2?dp[i-2]:1);
                 }
                 else{
                     dp[i]=dp[i-1];
                 }
               
           }
            
        }
        return dp[s.length()-1];
    
    }
}