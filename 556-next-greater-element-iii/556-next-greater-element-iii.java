class Solution {
    public int nextGreaterElement(int n) {
        
        String s = "";
        s+=n;
        
        char c[] = s.toCharArray();
        
        int i = c.length-2;
        
        while(i >= 0 && c[i] >= c[i+1]){
            i--;
        }
        if(i == -1){
            return -1;
        }
        
        int k = c.length-1;
        
        while(c[i] >= c[k]){
            k--;
        }
        
        char temp = c[k];
        c[k] = c[i];
        c[i] = temp;
        
        String ans="";
        
        for(int j=0; j<=i; j++){
            ans+=c[j];
        }
        
        for(int j=c.length-1; j>i; j--){
            ans+=c[j];
        }
        
        
        
        long val = Long.parseLong(new String(ans));
        return (val <= Integer.MAX_VALUE) ? (int) val : -1;
        
        
        
    }
}