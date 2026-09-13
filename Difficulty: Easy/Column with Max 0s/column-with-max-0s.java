class Solution {
    public int maxZeros(int[][] arr) {
        // code here
        int idx = -1, max = 0, count = 0;
        for(int j=0; j<arr[0].length; j++)
        {
            for(int i=0; i<arr.length; i++)
            {
                if(arr[i][j] == 0)
                {
                    count++;
                }
            }
            if(max<count)
            {
                max = count;
                idx = j;
            }
            count = 0;
        }
        return idx;
    }
}