class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        // code here
        int xor = 0;
        for(int i=0; i<arr.length; i++)
        {
            xor = xor^arr[i];
        }
        return xor;
    }
}