class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
        int idx= -1;
        for(int i=0; i< nums1.length; i++)
        {
            int greater = -1;
            for(int j=0; j<nums2.length-1; j++)
            {
                if(nums1[i] == nums2[j])
                {
                   for(int k=j+1; k<nums2.length; k++)
                   {
                    if(nums2[k] > nums2[j])
                    {
                        greater = nums2[k];
                        break;
                    }
                   }
                   break;
                }
            }
            ans[i] = greater;
        }
        return ans;
    }
}