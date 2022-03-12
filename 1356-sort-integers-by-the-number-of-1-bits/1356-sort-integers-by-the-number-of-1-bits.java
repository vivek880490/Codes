class Solution{
public int[] sortByBits(int[] arr) {
        
    Integer[] input = new Integer[arr.length];
int i = 0;
for (int value : arr) {
    input[i++] = Integer.valueOf(value);
}
        Arrays.sort(input, (a, b) -> Integer.bitCount(a) == Integer.bitCount(b) ? a - b : Integer.bitCount(a) - Integer.bitCount(b));
    
       
int j = 0;
for (int value : input) {
    arr[j++] = Integer.valueOf(value);
}
    return arr;
    }
}