class Solution {
    public int subsequenceSum(String s) {
        // code here
        int power = 1;
        int ans = 0;
        for(int i=1; i<s.length(); i++)
        {
            power = power * 2;
        }
        for(int j=0; j<s.length(); j++)
        {
            char ch = s.charAt(j);
            ans += (ch - '0') * power;
        }
        return ans;
    }
}