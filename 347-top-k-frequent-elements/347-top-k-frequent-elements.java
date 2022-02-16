class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        List<Integer>[]arr=new ArrayList[nums.length+1];
        
        HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        
        for(int key:map.keySet()){
            int val=map.get(key);
            if(arr[val]==null){
                arr[val]=new ArrayList<>();
            }
            arr[val].add(key);
        }
        
        int ans[]=new int[k];
        
        int count=0;
        
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=null){
                
                List<Integer>al=arr[i];
                
                for(int j=0;j<al.size();j++){
                    ans[count]=al.get(j);
                    count++;
                }
                if(count==k) break;
            }
        }
        return ans;
    }
}