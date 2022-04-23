class Solution {
    public String destCity(List<List<String>> paths) {
        
        HashMap<String, String> map = new HashMap<>();
        
        for(List<String> x : paths){
            map.put(x.get(0), x.get(1));
        }
        
        for(List<String> x : paths){
            if(map.containsKey(x.get(1)) == false){
                return x.get(1);
            }
        }
        return "";
    }
}