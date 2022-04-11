class Solution {
    public int mostFrequent(int[] nums, int key) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans=-1;
        int max=Integer.MIN_VALUE;
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i]==key){
                
                // if(!map.containsKey(nums[i+1])){
                //     map.put(nums[i+1], 1);
                // }
                // else{
                //     int x = map.get(nums[i+1]);
                //     map.put(nums[i+1], ++x);
                // }
                map.put(nums[i+1],map.getOrDefault(nums[i+1],0)+1);
                if(map.get(nums[i+1])>max){
                    max=map.get(nums[i+1]);
                    ans=nums[i+1];
                }
            }
        }
        return ans;
    }
}