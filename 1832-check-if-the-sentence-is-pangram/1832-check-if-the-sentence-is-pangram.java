class Solution {
    public boolean checkIfPangram(String sentence) {
        
        boolean arr[] = new boolean[26];
        
        for(int i=0; i<sentence.length(); i++){
            char ch = sentence.charAt(i);
            arr[ch-'a'] = true;
        }
        
        for(Boolean x : arr){
            if(x == false){
                return false;
            }
        }
        
        return true;
    }
}