class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> evenArr=new ArrayList<>();
        List<Integer> oddArr=new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
        {
            if (i % 2 != 1) 
            {
                evenArr.add(nums[i]);
            }
            else
            {
                oddArr.add(nums[i]);
            }
        }

        Collections.sort(evenArr);
        Collections.sort(oddArr, Collections.reverseOrder());
 
        int i = 0;
        for (int j = 0; j < evenArr.size(); j++)
        {
            nums[i] = evenArr.get(j);
            i+=2;
        }
        i=1;
        for (int j = 0; j < oddArr.size(); j++) 
        {
            nums[i] = oddArr.get(j);
            i+=2;
        }
        return nums;
   
    }
}