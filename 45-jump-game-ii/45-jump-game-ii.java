class Solution {
   
       
         public int jump(int[] nums) {
             
		 Integer qb[] = new Integer[nums.length+5];
		 return minJumps(nums, 0,qb);
	 }
    
	 int minJumps(int[] a,int i, Integer qb[]) {
         
		 if(i >= a.length) return (Integer.MAX_VALUE-5);
         
		 if(i == a.length-1) return 0;
         
		 if(qb[i] != null) return qb[i];
		 
		 int jump = Integer.MAX_VALUE-5;
         
		 for(int j = 1;j <= a[i]; j++) {
			 jump=Math.min(jump,1 + minJumps(a, i+j,qb));
		 }
		 return qb[i]=jump;
	 }
}