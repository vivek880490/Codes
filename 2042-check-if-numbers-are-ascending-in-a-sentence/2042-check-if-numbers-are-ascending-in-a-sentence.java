class Solution {
    public boolean areNumbersAscending(String s) {
       
        String arr[] = s.split(" ");
       int prev = -1;
        for(int i=0; i<arr.length; i++){
            if(Character.isDigit(arr[i].charAt(0))){
                int cur = Integer.parseInt(arr[i]);
                if(cur > prev){
                    prev = cur;
                }
                else{
                    return false;
                }
            }
        }
        
       //System.out.println();
        
        return true;
    }
}