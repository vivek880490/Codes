class Solution {
    public double average(int[] salary) {
        
        int min=Integer.MAX_VALUE;
        int max=0;
        int sum=0;
        for(int x:salary){
            min=Math.min(min,x);
            max=Math.max(max,x);
            sum+=x;
        }
        
        System.out.println(sum);
        
        sum-=min;
        sum-=max;
        
         System.out.println(sum);
        
        double n= salary.length-2;
        return  sum/n;
        
        
    }
}