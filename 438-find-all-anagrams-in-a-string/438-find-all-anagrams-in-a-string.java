class Solution {
    
    public List<Integer> findAnagrams(String s, String p) {
            
        List<Integer> ans = new ArrayList<>();
        
        if(s.length() == 0 || p.length() == 0 || s.length() < p.length()) return ans;
         
        int m = s.length();
        int n = p.length();
        
        int pf[] = freq(p);
        int sf[] = freq(s.substring(0, n));
        
        if(same(pf,sf)) ans.add(0);
            
        for(int i=n; i<m; i++){
            sf[s.charAt(i-n)-'a']--;
            sf[s.charAt(i)-'a']++;
            
            if(same(sf, pf)){
                ans.add(i-n+1);
            }
        }
        return ans;
    }
    
    int[] freq(String s){
        
        int freq[] = new int[26];
        
        for(int i=0; i<s.length(); i++){
         char ch = s.charAt(i);
            freq[ch-'a']++;
        }
        
        return freq;
    }
    
    boolean same(int f1[], int f2[]){
        
        for(int i=0; i<f1.length; i++){
            if(f1[i] != f2[i]){
                return false;
            }
        }
        return true;
        
    }
}