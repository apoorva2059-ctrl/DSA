class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        int freq[] = new int[arr.length+1];
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0; i<arr.length; i++)
        {
            int idx = arr[i];
            freq[idx]++;
            if(freq[idx]>1)
            {
                l.add(idx);
            }
        }
        return l;
    }
}