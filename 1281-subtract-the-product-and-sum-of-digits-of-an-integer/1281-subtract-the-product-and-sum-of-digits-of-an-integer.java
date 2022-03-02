class Solution {
    public int subtractProductAndSum(int n) {
        int mult=1;
        int sum=0;
        while(n>0){
            int digit = n%10;
            mult = mult*digit;
            sum = sum+digit;
            n=n/10;
        }
        
        return mult - sum;
    }
}