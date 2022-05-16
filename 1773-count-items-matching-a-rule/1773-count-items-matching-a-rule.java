class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int idx = 0;
        if(ruleKey.equals("type")) idx = 1;
        if(ruleKey.equals("color")) idx = 2;
        if(ruleKey.equals("name")) idx = 3;
        int count = 0;
        System.out.println(idx);
        for(List<String> x : items){
            if(x.get(idx-1).equals(ruleValue)){
                count++;
            }
        }
        
        return count;
    }
}