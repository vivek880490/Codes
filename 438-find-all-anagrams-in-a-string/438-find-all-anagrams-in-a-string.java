class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
       
        
        ArrayList<Integer>al=new ArrayList<>();
        
        if (s.length() == 0 || p.length() == 0 || s.length() < p.length()){
           return new ArrayList<Integer>();
       }
       
        int n=s.length();
        int m=p.length();
        
        int count[]=fre(p);
        
        int ccount[]=fre(s.substring(0,m));
        
        if(same(count,ccount))
            al.add(0);
        
       
        
        for(int i=m;i<n;i++){
            ccount[s.charAt(i-m)-'a']--;
            ccount[s.charAt(i)-'a']++;
            
            if(same(count,ccount))
                al.add(i-m+1);
            
        }
        return al;
        
      
    }
    
    boolean same(int count[],int ccount[]){
        for(int i=0;i<26;i++){
        if(count[i]!=ccount[i]){
            return false;
        }
        }
        return true;
    }
    
    int [] fre(String s){
        int count[]=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        return count;
    }
}