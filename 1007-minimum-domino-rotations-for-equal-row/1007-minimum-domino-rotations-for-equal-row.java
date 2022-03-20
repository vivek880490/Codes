class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        
        int ac[] = new int[7];
        int bc[] = new int[7];
        int sc[] = new int[7];
        
        for(int i=0; i<tops.length; i++){
            ac[tops[i]]++;
            bc[bottoms[i]]++;
            
            if(tops[i] == bottoms[i]) sc[tops[i]]++;
        }
        
        for(int i = 1; i<=6; i++){
            if(ac[i] + bc[i] - sc[i] == tops.length){
                return Math.min(ac[i] - sc[i], bc[i] - sc[i]);
            }
        }
        return -1;
    }
}