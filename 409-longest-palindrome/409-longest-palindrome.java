class Solution {
    public int longestPalindrome(String s) {
        
        HashMap<Character,Integer>map=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        boolean isfirstodd=true;
        
        int ans=0;
        
        for(Character c:map.keySet()){
            if(map.get(c)%2==0){
                ans+=map.get(c);
            }
            else{
                if(isfirstodd==true){
                    ans+=map.get(c);
                    isfirstodd=false;
                }
                else{
                    ans+=map.get(c)-1;
                }
            }
        }
        return ans;
        
    }
}