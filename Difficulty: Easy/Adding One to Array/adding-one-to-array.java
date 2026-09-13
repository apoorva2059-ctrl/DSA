class Solution {
    // Function for adding one to the number represented by the array
    Vector<Integer> addOne(int[] arr) {
        // code here
        Vector<Integer> v = new Vector<>();
        int i= arr.length-1;
        arr[i]++;
        int carry = 0;
        while(i>=0)
        {
            int sum = arr[i]+carry;
            arr[i] = sum%10;
            carry = sum/10;
            i--;
        }
        if(carry > 0)
        {
            v.add(carry);
        }
        for(i=0; i<arr.length; i++)
        {
            v.add(arr[i]);
        }
        return v;
    }
}