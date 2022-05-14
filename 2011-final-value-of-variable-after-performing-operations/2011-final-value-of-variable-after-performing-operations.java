class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        int val = 0;
        for(String x : operations){
            if(x .equals("--X") || x.equals("X--")){
                val-=1;
            }
            else if(x.equals ("++X") || x.equals("X++")){
                val+=1;
            }
        }
        return val;
    }
}