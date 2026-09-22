class Solution {
    public int remAnagram(String s1, String s2) {
        // code here
    int freq[] = new int[26];
    for(int i=0; i<s1.length(); i++)
    {
        freq[s1.charAt(i)-'a']++;
    }
    
    for(int j=0; j<s2.length(); j++)
    {
        freq[s2.charAt(j)-'a']--;
    }
    
    int ans =0;
    for(int i=0; i<26; i++)
      {
        ans = ans + Math.abs(freq[i]);
      }
    return ans;
    }
};