class Solution {
    public int thirdLargest(List<Integer> arr) {
        // code here
        
        int max1 = -1, max2 = -1, max3 = -1;
        for(int i=0; i<arr.size(); i++)
        {
         if(arr.get(i) >= max1)
         {
            max3 = max2;
            max2 = max1;
            max1 = arr.get(i);
         }
         else if(arr.get(i)>=max2 && arr.get(i) != max1)
         {
            max3 = max2; 
            max2 = arr.get(i);
         }
         else if(arr.get(i)>=max3 && arr.get(i)!= max1 && arr.get(i)!= max2)
         {
            max3 = arr.get(i);
         }
        }
        return max3;
    }
}