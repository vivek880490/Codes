class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        
        Arrays.sort(properties,(a,b)->(a[0] == b[0] ? a[1]-b[1] : b[0] - a[0]));
        
        
        int max = 0 ;
        int count = 0;
        for(int prop[] : properties){
            if(prop[1] < max){
                count++;
            }
            
            max = Math.max(max, prop[1]);
        }
        // 36 55 63
        return count;
    }
}