class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        
        int min = Integer.MAX_VALUE;
        for(int i=1; i<arr.length; i++){
            int diff = Math.abs(arr[i] - arr[i-1]);
            
            if(diff < min){
                
                min = diff;
                ans.clear();
                ArrayList<Integer> temp = new ArrayList<>();
                
                temp.add(arr[i-1]);
                temp.add(arr[i]);
                ans.add(new ArrayList<>(temp));
            }
            else if(diff ==min){
                 ArrayList<Integer> temp = new ArrayList<>();
                 temp.add(arr[i-1]);
                temp.add(arr[i]);
                ans.add(new ArrayList<>(temp));
            }
        }
        
        return ans;
    }
}