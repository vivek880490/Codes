class Solution {
    public int deleteAndEarn(int[] nums) {
    
        int arr[] = new int[100000];
        
        // repeating value hai to usko add karde rahe ek ghar bana de rahe hain
        
        for(int x : nums){
            arr[x] += x;
        }
        Integer qb[] = new Integer[100000];
        return solve(arr, 0,qb);
    
    }
    int solve(int arr[], int i, Integer qb[]){
        
        if(i >= arr.length) return 0;
        
        if(qb[i] != null) return qb[i];
        
        int rob = arr[i] + solve(arr, i+2, qb);
        int skip = solve(arr, i+1, qb);
        
        int temp = Math.max(rob, skip);
        
        return qb[i] = temp;
    }
}