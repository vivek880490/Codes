class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        
        
        List<Boolean> res = new ArrayList<>();
        
        for(int i=0; i<l.length; i++){
           boolean ans = solve(nums,l[i],r[i]); 
            res.add(ans);
            
        }
        
        return res;
        
    }
    
    boolean solve(int nums[], int i, int j){
        int len = j-i+1;
        
        if(len < 2) return false;
        
        int arr[] = new int[len];
        
        int v = 0;
        while(v < len){
            arr[v] = nums[i];
            i++;
            v++;
        }
        
        Arrays.sort(arr);
        
        for(int l=2; l<arr.length; l++){
            if(arr[l] - arr[l-1] != arr[l-1] - arr[l-2]){
                return false;
            }
        }
        return true;
    }
}