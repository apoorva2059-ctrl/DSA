class Solution {
    public int getCarries(String s1, String s2) {
        // code here
        int count = 0, carry = 0, sum = 0;
        int i = s1.length()-1;
        int j = s2.length()-1;
        while(i >= 0 && j >= 0)
        {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(j);
            sum = (ch1-'0') + (ch2-'0') + carry;
            carry = sum / 10;
            if(carry > 0)
            {
                count++;
            }
            i--;
            j--;
        }
        
        while( i >= 0)
        {
            sum = (s1.charAt(i)-'0') + carry;
            carry =  sum /10;
            if(carry > 0)
            {
                count++;
            }
            i--;
        }
        while(j >= 0)
        {
            sum = (s2.charAt(j) - '0') + carry;
            carry =  sum /10;
            if(carry > 0)
            {
                count++;
            }
            j--;
        }
        return count;
    }
};