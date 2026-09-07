class Solution {
    public void swapElements(int[] arr) {
        // code here
        for(int i=0; i<arr.length-2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[i+2];
            arr[i+2] = temp;
        }
    }
}