class Solution {
    public void swapElements(int[] arr) {
        // code here
        int a[] = new int[2];
        for(int i=0; i<arr.length-2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[i+2];
            arr[i+2] = temp;
        }
    }
}