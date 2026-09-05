class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
      int product = 1;
      int left[] = new int[arr.length], right[] = new int[arr.length]; 
      int ans[] = new int[arr.length];
      for(int i=0; i<arr.length; i++)
      {
        left[i] = product;
        product *= arr[i];
      }
      product = 1;
      for(int i = arr.length-1; i>= 0; i--)
      {
          right[i] = product;
          product *= arr[i];
      }
      for(int i=0; i<arr.length; i++)
      {
          ans[i] = left[i]*right[i];
      }
      return ans;
    }
}
