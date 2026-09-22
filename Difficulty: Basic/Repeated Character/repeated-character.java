class Solution {
    char firstRep(String S) {
        // your code here
        int arr[] = new int[26];
        for(int i =0; i<S.length(); i++)
        {
            int idx = S.charAt(i) -'a';
            arr[idx]++;
        }
        for(int i=0; i<S.length();i++)
        {
            int idx = S.charAt(i)-'a';
            if(arr[idx] >1)
            {
                return S.charAt(i);
            }
        }
        
        return '#';
    }
}