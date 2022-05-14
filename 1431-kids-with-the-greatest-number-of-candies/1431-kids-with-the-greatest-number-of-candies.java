class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int max = 0;
        for(int x : candies){
            max = Math.max(x, max);
        }
        List<Boolean> ans = new ArrayList<>();
        for(int x : candies){
            if(max - x > extraCandies){
                ans.add(false);
            }
            else{
                ans.add(true);
            }
        }
        return ans;
    }
}