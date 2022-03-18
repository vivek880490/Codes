class Solution {
    public int kthGrammar(int n, int k) {
        
        if(n == 1 || k == 1) return 0;
        
        int mid = (int)Math.pow(2,n-1)/2;
        
        if(k <= mid){
            return kthGrammar(n-1, k);
        }
        else{
            int x = kthGrammar(n-1, k-mid);
            
            return x == 0?1:0;
        }
    }
}