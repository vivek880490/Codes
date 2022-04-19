class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        
        Arrays.sort(target);
        Arrays.sort(arr);
        
        int n = target.length;
        int m = arr.length;
        if(m != n) return false;
        
        for(int i=0; i<m; i++){
            if(target[i] != arr[i]) return false;
        }
        return true;
    }
}