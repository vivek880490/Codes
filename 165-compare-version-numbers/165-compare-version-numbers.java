class Solution {
    public int compareVersion(String version1, String version2) {
        
        String a[]=version1.split("\\.");
        String b[]=version2.split("\\.");
        
        int len=Math.max(a.length,b.length);
        
        for(int i=0;i<len;i++){
            Integer num1=(i<a.length?Integer.parseInt(a[i]):0);
            Integer num2=i<b.length?Integer.parseInt(b[i]):0;
            
            int compare = num1.compareTo(num2);
            if(compare!=0){
                return compare;
            }
        }
        
        return 0;
}
}