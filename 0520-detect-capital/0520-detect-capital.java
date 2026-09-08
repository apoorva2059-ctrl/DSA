class Solution {
    public boolean detectCapitalUse(String word) {
        int uppercount = 0;
       for(int i=0; i<word.length(); i++)
       {
        char ch = word.charAt(i);
        if(Character.isUpperCase(ch))
        {
            uppercount++;
        }
       }
        if(uppercount == word.length())
        {
            return true;
        }
        if(uppercount == 0)
        {
            return true;
        }
        if(uppercount == 1 && Character.isUpperCase(word.charAt(0)))
        {
            return true;
        }
       return false;
    }
}