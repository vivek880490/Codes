class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        int freq[] = new int[10001];
        
        for(int x : arr1) freq[x]++;
        
        int i = 0;
        
        for(int x : arr2){
            while(freq[x] --> 0){
                arr1[i] = x;
                i++;
            }
        }
        
        for(int j = 0; j<freq.length; j++){
            while(freq[j] --> 0){
                arr1[i] = j;
                i++;
            }
        }
        
        return arr1;
    }
}