class Solution {
    public int maxStep(int[] arr) {
        // code here
        int max = 0, count = 0;
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i] < arr[i+1])
            {
                count++;
            }
            else
            {
                count = 0;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}