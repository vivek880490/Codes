class Solution {
    public int strStr(String s, String t) {
        
        if(s.equals(t)) return 0;
        
        return s.indexOf(t);
        
//         int i = 0;
//         int j = 0;
//         boolean flag = true;
//         while(i < s.length() && j < t.length()){
//             if(s.charAt(i) == s.charAt(j)){
                
//                 int k = i;
//                 int l = j;
                
//                 while(k < s.length() && l < t.length()){
//                     if(s.charAt(k) != t.charAt(l)){
//                         flag = false;
//                      break;   
//                     }
//                     else{
//                     flag = true;
//                     }
//                     k++;
//                     l++;
//                 }
                
//                 i++;
//                 j++;
                
//             }
//             else{
                
//                 i++;
//             }
//         }
        
//         if(j == t.length()-1  && flag == true) return  i;
//         return -1;
    }
}