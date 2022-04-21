class Solution {
    public int[] findRightInterval(int[][] intervals) {
        
        int sp[] = new int[intervals.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<intervals.length; i++){
            sp[i] = intervals[i][0];
            map.put(intervals[i][0], i);
        }
        
        Arrays.sort(sp);
        
        int ans[] = new int[intervals.length];
        
        
        for(int i=0; i<intervals.length; i++){
            int res = bs(intervals[i][1], sp);
            if(res == sp.length){
                ans[i] = -1;
            }
            else if(res == 0){
                if(intervals[i][1] <= sp[0]){
                    ans[i] = map.get(sp[0]);
                }
                else{
                    ans[i] = -1;
                }
            }
            else{
                ans[i] = map.get(sp[res]);
            }
        }
    
        return ans;
    }
    
    int bs(int x, int sp[]){
        int l = 0;
        int h = sp.length-1;
        
        while(l <= h){
            int mid = l + (h-l)/2;
            
            if(x > sp[mid]){
                l = mid + 1;
            }
            else{
                h = mid-1;
            }
        }
        return l;
    }
}