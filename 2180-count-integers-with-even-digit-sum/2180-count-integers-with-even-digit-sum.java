class Solution {
    public int countEven(int num) {
        
        int count=0;
        
        for(int i=1;i<=num;i++){
            int n=i;
            int digitsum=0;
            
            while(n>0){
                int digit=n%10;
                digitsum+=digit;
                n=n/10;
            }
            if(digitsum%2==0){
                count++;
            }
        }
        return count;
        
    }
}