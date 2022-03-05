class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
       int nge[] = new int[nums2.length];
        nge[nge.length-1]=-1;
        
        for(int i=nge.length-2;i>=0;i--){
            
            if(nums2[i]>nums2[i+1]){
                nge[i]=-1;
                int j = i+2;
                while(j<nge.length){
                    if(nums2[j]>nums2[i]){
                        nge[i]=nums2[j];
                        break;
                    }
                    j++;
                }
            }
            else if(nums2[i]<nums2[i+1]){
                nge[i]=nums2[i+1];
            }
        }
        
       int ans[]= new int [nums1.length];
        
        for(int i=0;i<ans.length;i++){
            int n1 = nums1[i];
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==n1){
                    ans[i]=nge[j];
                }
            }
        }
        
        return ans;
    }
}