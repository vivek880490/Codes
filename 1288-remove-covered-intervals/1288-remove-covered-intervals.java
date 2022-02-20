class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        int count=1;
        
        int start=intervals[0][0];
        int end=intervals[0][1];
        
        int i=1;
        while(i<intervals.length){
            int s=intervals[i][0];
            int e=intervals[i][1];
            
            if(start<s && end<e){
                start=s;
                count++;
            }
            end=Math.max(e,end);
            i++;
        }
        return count;
    }
}