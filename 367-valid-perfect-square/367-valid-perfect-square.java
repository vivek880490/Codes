class Solution {
    public boolean isPerfectSquare(int num) {
        
        long l=1;
        long h=num;
        
        while(l<=h){
            long mid=l+(h-l)/2;
            if(mid*mid>num){
                h=mid-1;
            }
            else if(mid*mid<num){
                l=mid+1;
            }
            else{
                System.out.print(mid);
                return true;
            }
        }
        return false;
    }
}