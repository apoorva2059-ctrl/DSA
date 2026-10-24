class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String sum1 = "";
        String sum2 = "";
        int i = 0;
        while(i< word1.length)
        {
            sum1 += word1[i];
            i++;
        }
        int j=0; 
        while(j< word2.length)
        {
            sum2 += word2[j];
            j++;
        }
        if(sum1.length() != sum2.length())
        {
            return false;
        }
        for(int k=0; k<sum1.length(); k++)
        {
                if(sum1.charAt(k) != sum2.charAt(k))
                {
                    return false;
                }
        }
        return true;
    }
}