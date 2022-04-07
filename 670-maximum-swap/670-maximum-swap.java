class Solution {
    public int maximumSwap(int num) {
        
        String s = Integer.toString(num);
        
        char arr[] = s.toCharArray();
        
        int li[] = new int[10];
        // last index of element
        for(int i=0; i<arr.length; i++){
            int digit = arr[i] - '0';
            li[digit] = i;
        }
        
        // find out position for swapping
        
        boolean flag = false;
        for(int i=0; i<arr.length; i++){
            int digit = arr[i] - '0';
            
            for(int j=9; j>digit; j--){
                if(i < li[j]){
                    swap(arr, i, li[j]);
                    flag = true;
                    break;
                }
            }
            if(flag == true) break;
        }
        
        String t = String.valueOf(arr);
        
        int ans = Integer.valueOf(t);
        
        return ans;
        
        
        
    }
    
    void swap(char ch[], int i, int j){
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }
}