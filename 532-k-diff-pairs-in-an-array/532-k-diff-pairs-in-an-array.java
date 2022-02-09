class Solution {
    public int findPairs(int[] nums, int k) {
        
    HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        
    int count=0;
        
        
                for(int n:map.keySet()){
                    if(k==0){
                        if(map.get(n)>=2){
                            count++;
                        }
                    }
                    else{
                        if(map.containsKey(n+k)){
                            count++;
                        }
                    }
                }
        return count;
        
        
        
    }
}