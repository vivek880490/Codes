class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        
        
        int i=0;
        int j=0;
        ArrayList<int[]>al=new ArrayList<>();
        while(i<firstList.length && j<secondList.length){
            if(firstList[i][1]<secondList[j][0]){
                i++;
            }
            else if(secondList[j][1]<firstList[i][0]){
                j++;
         
            }
            else{
                int s=Math.max(firstList[i][0],secondList[j][0]);
                int e=Math.min(firstList[i][1],secondList[j][1]);
                
                al.add(new int[]{s,e});
                
                if(firstList[i][1]<secondList[j][1]) i++;
                else j++;
            }
        }
        return al.toArray(new int[al.size()][]);
    }
}