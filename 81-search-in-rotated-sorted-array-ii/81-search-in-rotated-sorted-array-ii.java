class Solution {
    public boolean search(int[] nums, int target) {
        int minIndex = 0;
        for(int i= 0 ; i<nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                minIndex = i+1; 
                break;
            }
        }
        boolean part1 = check(nums,target,0,minIndex-1); 
        boolean part2 = check(nums,target,minIndex,nums.length-1); 
        if(!part1 && !part2){
            return false; // if not avalaible in both parts return false;
        }
        return true;
    }
    public boolean check(int[] nums, int target, int start, int end){ //normal binary search logic heree
        
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                return true;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else start = mid+1;
        }
        return false;
    }
}