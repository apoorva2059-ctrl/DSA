class Solution {
    int transitionPoint(int arr[]) {
        // code here
        for(int i=0; i<arr.length;i++)
        {
            while(arr[i] == 1)
            {
                return i;
            }
        }
        return -1;
        
    }
}