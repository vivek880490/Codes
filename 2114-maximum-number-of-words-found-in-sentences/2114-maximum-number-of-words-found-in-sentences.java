class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String x : sentences){
            String arr[] = x.split(" ");
            max = Math.max(arr.length, max);
            
        }
        
        return max;
    }
}