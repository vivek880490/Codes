class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        
        HashSet<Integer>set1 = new HashSet<>();
        HashSet<Integer>set2 = new HashSet<>();
        
        for(int x:nums1){
            set1.add(x);
        }
          for(int x:nums2){
            set2.add(x);
        }
        
        ArrayList<Integer>al=new ArrayList<>();
        
        for(int x: set1){
            if(set2.contains(x)){
                al.add(x);
            }
        }
        
        int ans[] = new int[al.size()];
        int i=0;
        for(int x:al){
            ans[i]=x;
            i++;
        }
        return ans;
    }
}