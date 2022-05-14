class Solution {
    public boolean isPathCrossing(String path) {
        if(path.length() == 1) return false;
        
        HashSet<String> set = new HashSet<>();
        int x = 0;
        int y = 0;
        set.add(x+" "+y);
        for(int i=0; i<path.length(); i++){
            char ch = path.charAt(i);
            
            if(ch == 'N'){
                y++;
                
            }
           else if(ch == 'S'){
                y--;
                
            }
            else if(ch == 'E'){
                x++;
                
            }
            else if(ch == 'W'){
                x--;
                
            }
            
            String temp = x +" "+y;
            
            if(set.contains(temp)){
                return true;
            }
            else{
                set.add(temp);
            }
        }
        
        return false;
    }
}