class Solution {
    public int findElement(int[] arr) {
        // code here
        int leftmax[] = new int[arr.length];
        int rightmin[] = new int[arr.length];
        leftmax[0] = arr[0];
        for(int i=1; i<arr.length; i++)
        {
            leftmax[i] = Math.max(leftmax[i-1], arr[i]);
        } 
        rightmin[arr.length-1] = arr[arr.length-1];
        for(int i= arr.length-2; i>=0; i--)
        {
            rightmin[i] = Math.min(rightmin[i+1], arr[i]);
        }
        for(int i=1; i<arr.length-1; i++)
        {
            if(leftmax[i-1] <= arr[i] && arr[i] <= rightmin[i+1])
            {
                return arr[i];
            }
        }
        return -1;
    }
}
