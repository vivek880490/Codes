class Solution {
    public double average(int[] salary) {
        
        Arrays.sort(salary);
        
        int sum=0;
        for(int x:salary){
            sum+=x;
        }
        
        System.out.println(sum);
        
        sum=sum-salary[0];
        sum=sum-salary[salary.length-1];
        
         System.out.println(sum);
        
        double n= salary.length-2;
        return  sum/n;
        
        
    }
}