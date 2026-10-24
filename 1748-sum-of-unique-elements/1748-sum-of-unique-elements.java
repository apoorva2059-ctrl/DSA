class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        int freq[] = new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            if((i == 0 || nums[i] != nums[i - 1]) && (i == nums.length - 1 || nums[i] != nums[i + 1]))
            {
                sum += nums[i];
            }
        }
        return sum;
    }
}