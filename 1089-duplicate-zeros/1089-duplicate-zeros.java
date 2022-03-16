class Solution {
    public void duplicateZeros(int[] arr) {
        
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                al.add(0);
                al.add(0);
            }
            else{
                al.add(arr[i]);
            }
        }
        
        for(int j=0; j<arr.length; j++){
            arr[j] = al.get(j);
        }
        
    }
    
    
}