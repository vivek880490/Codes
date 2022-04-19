class Solution {
    public int minEatingSpeed(int[] piles, int m) {
        
        //if(m<piles.length) return -1;
        
        int max=0;
        
        for(int x:piles){
            max=Math.max(max,x);
        }
        
        int l=0;
        int h=max;
        int ans=0;
        
        while(l<=h){
            int speed= l+(h-l)/2;
            
            if(solve(speed,piles,m)==true){
                ans=speed;
                h=speed-1;
                
            }
            else{
                l=speed+1;
            }
        }
        return ans;
    }
        
        boolean solve(int speed,int arr[],int m){
            int time=0;
            for(int i=0;i<arr.length;i++){
            time+=(int)Math.ceil(arr[i]*1.0/speed);
            }
        
        return time<=m;
        }
        
    
}