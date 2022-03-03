class Solution {
    public int largestPerimeter(int[] nums) {
        
        Arrays.sort(nums);
        
        ArrayList<Integer>al=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            al.add(nums[i]);
        }
        
        int max=0;
        Collections.sort(al,Collections.reverseOrder());
        
        for(int i=0;i<al.size()-2;i++){
            if(al.get(i)<al.get(i+1)+al.get(i+2)){
                max=Math.max(max,al.get(i)+al.get(i+1)+al.get(i+2));
                break;
            }
        }
        
        return max==0?0:max;
       
        
        
    }
}