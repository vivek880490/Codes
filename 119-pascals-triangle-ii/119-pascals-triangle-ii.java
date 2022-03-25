class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        ArrayList<Integer>al=new ArrayList<>();
        
        long val=1;
        
        for(int j=0;j<=rowIndex;j++){
            al.add((int)val);
            val= val*(rowIndex-j)/(j+1);
            
        }
        return al;
        
    }
}