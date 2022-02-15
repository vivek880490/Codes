class Solution {
    public int findJudge(int n, int[][] trust) {
        
        if(n==1) return n;
        
        HashSet<Integer>set=new HashSet<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int arr[]:trust){
            set.add(arr[0]);
        }
        
        for(int arr[]:trust){
            map.put(arr[1],map.getOrDefault(arr[1],0)+1);
        }
        
       for(int k:map.keySet()){
           if(set.contains(k)==false){
               int f=map.get(k);
               
               if(f==n-1){
                   return k;
               }
           }
       }
        return -1;
        
    }
}