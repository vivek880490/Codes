class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans = new ArrayList<>();
        
        HashMap<Integer, Integer> win = new HashMap<>();
    
        HashMap<Integer, Integer> loose = new HashMap<>();
        
        for(int i=0; i<matches.length; i++){
            int arr[] = matches[i];
            
            win.put(arr[0], win.getOrDefault(arr[0],0)+1);
            loose.put(arr[1], loose.getOrDefault(arr[1],0)+1);
        }
        
        List<Integer> winner = new ArrayList<>();
        
        
        for(int key : win.keySet()){
            if(loose.containsKey(key) == false){
                winner.add(key);
            }
        }
        
         List<Integer> looser = new ArrayList<>();
        
       for(int key : loose.keySet()){
            if(loose.get(key) == 1){
                looser.add(key);
            }
        }
        Collections.sort(winner);
        Collections.sort(looser);
        
        ans.add(winner);
        ans.add(looser);
        

        return ans;
        
        
        
        
    }
}