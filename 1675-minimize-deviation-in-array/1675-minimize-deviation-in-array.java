class Solution {
    public int minimumDeviation(int[] nums) {
        
        TreeSet<Integer>set=new TreeSet<>();
        
        
       
        
        for(int i:nums){
            if(i%2==1) i=i*2;
            
            set.add(i);
        }
        
        int diff=Integer.MAX_VALUE;
        
        while(true){
            int max=set.last();
            int min=set.first();
            
            diff=Math.min(diff,max-min);
            
            if(max%2==0){
                set.remove(max);
                set.add(max/2);
            }
            else{
                break;
            }
        }
        
        return diff;
        
    }
}