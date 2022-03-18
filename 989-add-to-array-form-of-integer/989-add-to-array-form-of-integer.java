class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        ArrayList<Integer> al = new ArrayList<>();
        
        while(k > 0){
            int digit = k%10;
            al.add(0,digit);
            k = k/10;
        }
        
        int l = num.length-1;
        int h = al.size()-1;
        
        int carry = 0;
        
        while(l >=0 || h>=0 ){
            
            int sum = (l >= 0 ? num[l]:0) + (h >= 0 ? al.get(h):0) + carry;
            
            int digit = sum%10;
            
             carry = sum/10;
            
            ans.add(0,digit);
            
            l--;
            h--;
            
        }
        if(carry != 0){
            ans.add(0,1);
        }
        
        while(l>=0){
            ans.add(0,num[l]);
            l--;
        }
        
        while(h>=0){
            ans.add(al.get(h));
            h--;
        }
    
        return ans;
    
    }
}