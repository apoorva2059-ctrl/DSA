class Solution {
    public int maxProductDifference(int[] nums) {
        int maxdiff = 0;
        int product1 = 1;
        int product2 = 1;
        Arrays.sort(nums);
        for(int i =0; i< nums.length; i++)
        {
            product1 = nums[nums.length-1]*nums[nums.length-2];
            product2 = nums[0] * nums[1];
            maxdiff = product1 - product2;
        }
        return maxdiff;
    }
}