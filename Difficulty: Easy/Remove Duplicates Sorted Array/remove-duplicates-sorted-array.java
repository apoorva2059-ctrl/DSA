class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> l = new ArrayList<>();
      for(int i=0; i<arr.length-1; i++)
      {
        if(arr[i] != arr[i+1])
        {
            l.add(arr[i]);
        }
      }
      l.add(arr[arr.length-1]);
      return l;
    }
}
