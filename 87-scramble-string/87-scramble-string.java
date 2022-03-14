class Solution {
    HashMap<String,Boolean>map;
    public boolean isScramble(String s1, String s2) {
        map = new HashMap<>();
        if(s1.length() != s2.length()) return false;
        
        if(s1.equals(s2)) return true;
        
        return solve(s1, s2);
        
    }
    
    boolean solve(String a, String b){
        
        String key = a+" "+b;
        if(map.containsKey(key)){
            return map.get(key);
        }
        if(a.equals(b)) return true;
        
        
        boolean flag = false;
        int n = a.length();
        
        for(int i=1; i<n; i++){
           boolean swap = (solve(a.substring(0, i),b.substring(n-i, n))==true) 
            && (solve(a.substring(i, n),b.substring(0, n-i))==true);
        
      
            
            boolean noswap = (solve(a.substring(0,i),b.substring(0,i))==true)
            && (solve(a.substring(i,n),b.substring(i,n))==true);
               
               
               if(swap || noswap){
                   flag = true;
                   break;
               }
        
            }
        
        
        map.put(key,flag);
        
        return flag;
        
        
    }
}