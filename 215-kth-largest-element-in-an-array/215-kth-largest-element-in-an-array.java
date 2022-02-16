class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        Queue<Integer>q=new PriorityQueue<>();
        
        for(int i=0;i<nums.length;i++){
            q.add(nums[i]);
        }
    int n=nums.length;
        n=n-k+1;
        int ans=0;
        while(n-->0){
           ans=q.poll();
        }
        return ans;
    }
}