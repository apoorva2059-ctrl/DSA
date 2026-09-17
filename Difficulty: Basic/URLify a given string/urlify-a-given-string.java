class Solution {
    static String URLify(String s) {
        // code here
        String ans ="";
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == ' ')
            {
                ans += "%20";
            }
            else
            {
                ans += s.charAt(i);
            }
        }
        return ans;
    }
}