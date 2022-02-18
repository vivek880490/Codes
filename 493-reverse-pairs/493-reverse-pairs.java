class Solution {
    public int reversePairs(int[] nums) {
        
        return mergesort(nums,0,nums.length-1);
        
    }
    
    int mergesort(int nums[],int l,int h){
        if(l>=h) return 0;
        
        int mid=(l+h)/2;
        
        int count=mergesort(nums,l,mid);
        count+=mergesort(nums,mid+1,h);
        count+=merge(nums,l,mid,h);
        
        return count;
    }
    
    int merge(int nums[],int l,int mid,int h){
        int count=0;
        
        int j=mid+1;
        
        for(int i=l;i<=mid;i++){
            while(j<=h && nums[i]> (2*(long)nums[j])){
                j++;
            }
            count+=(j-(mid+1));
        }
        
        ArrayList<Integer>temp=new ArrayList<>();
        int left=l;
        int right=mid+1;
        
        while(left<=mid && right<=h ){
            if(nums[left]<nums[right]){
                temp.add(nums[left]);
                left++;
            }
            else{
                temp.add(nums[right]);
                right++;
                
            }
        }
        
        while(left<=mid){
            temp.add(nums[left++]);
        }
        
        while(right<=h){
            temp.add(nums[right++]);
        }
        
        for(int i=l;i<=h;i++){
            nums[i]=temp.get(i-l);
        }
        return count;
    }
}