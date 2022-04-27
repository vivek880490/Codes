class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int ans[] = new int[2];
        
        int alice = 0;
        int bob = 0;
        for(int x : aliceSizes){
            alice += x;
        }
        for(int x : bobSizes){
            bob += x;
        }
        
        int target = (alice - bob)/2;
        
        for(int i=0; i<aliceSizes.length; i++){
            for(int j=0; j<bobSizes.length; j++){
                if(aliceSizes[i] == bobSizes[j]+target){
                    ans[0] = aliceSizes[i];
                    ans[1] = bobSizes[j];
                }
            }
        }
        return ans;
        // 3 5
        
    }
}