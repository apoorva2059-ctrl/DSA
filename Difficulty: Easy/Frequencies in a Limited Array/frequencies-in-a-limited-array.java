class Solution {
    public ArrayList<Integer> frequencyCount(int[] arr) {
        // code here
        int freq[] = new int[arr.length+1];
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0; i<arr.length; i++)
        {
            int idx = arr[i];
            freq[idx]++;
        }
        for(int i=1; i<freq.length; i++)
        {
            l.add(freq[i]);
        }
        return l;
    }
}
