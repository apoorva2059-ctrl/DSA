class Solution {
    public int visibleBuildings(int[] arr) {
        // code here
        int count = 0;
        int max = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] >= max)
            {
                max = arr[i];
                count++;
            }
        }
        return count;
    }
}