class Solution {
   
       
         public int jump(int[] nums) {
		 dp=new Integer[nums.length+5];
		 return minJumps(nums, 0);
	 }
	 Integer[] dp;
	 int minJumps(int[] a,int i) {
		 if(i>=a.length) return (Integer.MAX_VALUE-5);
		 if(i==a.length-1) return 0;
		 if(dp[i]!=null) return dp[i];
		 
		 int jump=Integer.MAX_VALUE-5;
		 for(int j=1;j<=a[i];j++) {
			 jump=Math.min(jump,1+ minJumps(a, i+j));
		 }
		 return dp[i]=jump;
	 }
}