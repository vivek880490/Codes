class Solution {
    public int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<dig.length; i++){
            set.add(dig[i][0]+" "+dig[i][1]);
        }
        
        int count=0;
        for(int[] a: artifacts){
            boolean flag=true;
            for(int i=a[0]; i<=a[2]; i++){
                for(int j=a[1]; j<=a[3];j++){
                    if(set.contains(i+" "+j)) continue;
                    else flag = false;
                }
            }
            if(flag) count++;
        }
        return count;
    }
}