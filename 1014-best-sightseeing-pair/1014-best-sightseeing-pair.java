class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        
        int n = values.length;
        
        int i = 0;
        int j = 1;
        int score = 0;
        int max = 0;
        while(i < n && j < n){
            score  = values[i] + values[j] + i - j;
            max = Math.max(score,max);
            
            if(values[i] > values[j]){
                values[i]--;
                
                int temp = values[i];
                values[i] = values[j];
                values[j] = temp;
            
            }
            i++;
            j++;
        }
        
        return max;
    }
}