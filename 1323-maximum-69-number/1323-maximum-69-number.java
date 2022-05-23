class Solution {
    public int maximum69Number (int num) {
        
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        
        String s = Integer.toString(num);
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '6' && flag == false){
                sb.append('9');
                flag = true;
            }
            else{
                sb.append(ch);
            }
        }
//         while(num > 0){
//             int temp = num%10;
            
//             if(temp == 6 && flag == false){
//                 sb.append(9);
//                 flag = true;
//             }
//             else{
//              sb.append(temp);   
//             }
            
//             num = num/10;
//     }
        
        String str = sb.toString();
        
        return Integer.parseInt(str);
}
}