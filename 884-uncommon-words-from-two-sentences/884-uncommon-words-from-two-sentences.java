class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        
        StringBuilder sb = new StringBuilder();
        
        HashMap<String,Integer> map1 = new HashMap<>();
        
        String arr[] = s1.split(" ");
        
        for(String x : arr){
            map1.put(x, map1.getOrDefault(x,0)+1);
        }
        
        String brr[] = s2.split(" ");
        
         HashMap<String,Integer> map2 = new HashMap<>();
        
        for(String x : brr){
            map2.put(x, map2.getOrDefault(x,0)+1);
        }
        
        for(String x : brr){
            if(map1.containsKey(x) == false && map2.get(x) < 2){
                sb.append(x+" ");
            }
        }
        
       
        
        for(String x : arr){
            if(map2.containsKey(x) == false && map1.get(x) < 2){
                sb.append(x+" ");
            }
        }
        
        String ans = sb.toString();
        
        String res[] = ans.split(" ");
        
        if(res.length == 1 && res[0].length() == 0) return new String[0];
        else return res;
    }
}