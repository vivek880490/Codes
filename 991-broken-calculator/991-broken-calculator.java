class Solution {
    public int brokenCalc(int startValue, int target) {
        
        if(startValue > target) return startValue-target;
        int count = 0;
        while(target > startValue){
            if(target%2 == 0){
                target = target/2;
            }
            else{
                target++;
            }
            count++;
            
            
             if(startValue > target) return count+startValue-target;
        }
        
        return count;
    }
}