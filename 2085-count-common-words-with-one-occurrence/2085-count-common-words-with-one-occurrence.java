class Solution {
    public int countWords(String[] s1, String[] s2) {
        
        int count = 0;
        
         HashMap<String,Integer> map1 = new HashMap<>();
        
        //String arr[] = s1.split(" ");
        
        for(String x : s1){
            map1.put(x, map1.getOrDefault(x,0)+1);
        }
        
       // String brr[] = s2.split(" ");
        
         HashMap<String,Integer> map2 = new HashMap<>();
        
        for(String x : s2){
            map2.put(x, map2.getOrDefault(x,0)+1);
        }
        
        for(String x : s2){
            if(map1.containsKey(x) == true && map2.get(x) < 2 && map1.get(x) < 2){
                count++;
            }
        }
        
       
        
        // for(String x : s1){
        //     if(map2.containsKey(x) == true && map1.get(x) < 2 && map2.get(x) < 2){
        //         count++;
        //     }
        // }
        
        return count;
    }
}