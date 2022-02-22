class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        if(s.length()==0 || p.length()==0 || s.length()<p.length()){
            return new ArrayList<Integer>();
        }
        
        List<Integer>al=new ArrayList<>();
        
        int m=s.length();
        int n=p.length();
        
        int pf[]=freq(p);
        int sf[]=freq(s.substring(0,n));
        
        if(same(pf,sf)) al.add(0);
        
        for(int i=n;i<m;i++){
            sf[s.charAt(i-n)-'a']--; //released 0th
            sf[s.charAt(i)-'a']++; //aquired next
            
            if(same(pf,sf)){
                al.add(i-n+1);
            }
            
        }
        return al;
        
    }
    
    boolean same(int pf[],int sf[]){
        for(int i=0;i<pf.length;i++){
            if(pf[i]!=sf[i]){
                return false;
            }
        }
        return true;
    }
    
    
    int [] freq(String str){
        int fre[]=new int[26];
        for(int i=0;i<str.length();i++){
            fre[str.charAt(i)-'a']++;
        }
        return fre;
    }
}