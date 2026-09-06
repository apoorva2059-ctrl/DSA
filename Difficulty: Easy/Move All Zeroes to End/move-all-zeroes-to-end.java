class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here

    int i=0, j=0;
    while(i<arr.length)
    {
        if(arr[i] == 0)
        {
            i++;
        }
        else
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j++;
        }
    }
  }
}