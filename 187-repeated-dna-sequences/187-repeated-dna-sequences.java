class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        
        HashMap<String,Integer>map=new HashMap<>();
        ArrayList<String>al=new ArrayList<>();
         
        if(s.length()<10) return al;
        
        for(int i=0;i<s.length()-9;i++){
            String str="";
            int l=i;
            int h=i+10;
            while(l<h){
                str+=s.charAt(l);
                l++;
            }
            
            map.put(str,map.getOrDefault(str,0)+1);
        }
        
        System.out.print(map);
        for(String str:map.keySet()){
            if(map.get(str)>1){
                al.add(str);
            }
        }
        return al;
        
    }
}