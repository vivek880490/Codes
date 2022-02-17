class Solution {
    public String frequencySort(String s) {
        
        ArrayList<Character>arr[]=new ArrayList[s.length()+1];
        HashMap<Character,Integer>map=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
        
        for(Character ch:map.keySet()){
            int freq=map.get(ch);
            if(arr[freq]==null){
            arr[freq]=new ArrayList<>();
            }
            int i=freq;
            while(i-->0){
            arr[freq].add(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=null){
                ArrayList<Character>al=arr[i];
                for(int j=0;j<al.size();j++){
                    sb.append(al.get(j));
                }
            }
        }
        return sb.toString();
        
        
    }
}