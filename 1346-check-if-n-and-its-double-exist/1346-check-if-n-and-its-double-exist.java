class Solution {
    public boolean checkIfExist(int[] arr) {
        
        HashSet<Integer> set = new HashSet<>();
        int zero = 0;
        
        for(int x : arr){
            if(x == 0) zero++;
            set.add(x);
        }
        if(zero >=2 ) return true;
        
        for(int x : set){
            if(x!= 0 && set.contains(2*x)){
                return true;
            }
        }
        return false;
    }
}