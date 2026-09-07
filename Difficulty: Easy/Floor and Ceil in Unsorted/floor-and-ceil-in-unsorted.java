class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int f = -1;
        int c = -1;
        int max = -1; int min = 1000000;
        int a[] = new int[2];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] <= x)
            {
                if(arr[i] > max)
                {
                    max = arr[i];
                     f = arr[i];
                }
            }
           if(arr[i] >= x)
            {
                if(arr[i] < min)
                {
                    min = arr[i];
                    c = arr[i];
                }
            } 
        }
        a[0] = f;
        a[1] = c;
        return a;
    }
}
