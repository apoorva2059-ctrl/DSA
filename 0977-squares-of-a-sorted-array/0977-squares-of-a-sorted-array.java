class Solution {
    public int[] sortedSquares(int[] nums) {
       int a[] = new int[nums.length];
       for(int i=0; i<nums.length; i++)
       {
         int sqr = nums[i]*nums[i];
         a[i] = sqr;
       } 
       Arrays.sort(a);
       return a;
    }
}