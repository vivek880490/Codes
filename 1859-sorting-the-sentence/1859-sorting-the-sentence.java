class Solution {
    public String sortSentence(String s) {
        
        
        
        String arr[] = s.split(" ");
        String nums[] = new String[arr.length+1];
        for(String x : arr){
            int n = Character.getNumericValue(x.charAt(x.length()-1));
            StringBuilder sbb = new StringBuilder();
            sbb.append(x,0,x.length()-1);
            
            nums[n] = sbb.toString() ;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=1; i<nums.length; i++){
            if(i == nums.length-1){
                sb.append(nums[i]);
            }
            else{
                sb.append(nums[i]+" ");
            }
           
        }
        
        return sb.toString();
    }
}