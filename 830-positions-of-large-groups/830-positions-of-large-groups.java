class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ans = new ArrayList<>();
        
        char ch[] = s.toCharArray();
        int i = 0;
        int j = 1;
        while(j <= s.length()){
            List<Integer> al = new ArrayList<>();
            if(j == s.length() || s.charAt(j) != s.charAt(i)){
                if(j-i >= 3){
                    al.add(i);
                    al.add(j-1);
                    ans.add(al);
                   
                }
                 i = j;
            }
        
            j++;
        }
        return ans;
    }
}