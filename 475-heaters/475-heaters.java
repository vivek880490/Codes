class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        
        
        Arrays.sort(heaters);
        int ans = 0;
        
        for(int i=0; i<houses.length; i++){
           
            int house = houses[i];
            
            int bs[] = solve(house, heaters);
            
            int d1 = bs[0] == -1 ? Integer.MAX_VALUE : house - bs[0];
            int d2 = bs[1] == -1 ? Integer.MAX_VALUE : bs[1] - house; 
            
            int mind = Math.min(d1, d2);
            
             ans = Math.max(ans, mind);
        }
        
        return ans;
    }
    
    int[] solve(int house, int heaters[]){
        int ans[] = {-1,-1};
        
        int l = 0;
        int h = heaters.length-1;
        
        while(l <= h){
            int mid = l + (h-l)/2;
            
            if(heaters[mid] == house){
                ans[0] = heaters[mid];
                ans[1] = heaters[mid];
                break;
            }
            else if(heaters[mid] < house){
                ans[0] = heaters[mid];
                l = mid + 1;
            }
            else{
                ans[1] = heaters[mid];
                h = mid - 1;
            }
        }
        
        return ans;
    }
}