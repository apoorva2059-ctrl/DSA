class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int i=0;
        int j=0;
        while(i < arr.length)
        {
            if(arr[i] == 1)
            {
                i++;
            }
            else
            {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j++;
            }
        }
    }
}
