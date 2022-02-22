class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int totalgas=0;
        int totalcost=0;
        
        for(int i=0;i<cost.length;i++){
            totalcost+=cost[i];
            totalgas+=gas[i];
        }
        
        if(totalgas<totalcost) return -1;
        
        int petrol=0;
        int start=0;
        
        for(int i=0;i<cost.length;i++){
            petrol+=gas[i];
            petrol-=cost[i];
            
            if(petrol<0){
                //yaha se start nahi karenge next dekho
                start=i+1;
                petrol=0;
            }
        }
        return start;
        
    }
}