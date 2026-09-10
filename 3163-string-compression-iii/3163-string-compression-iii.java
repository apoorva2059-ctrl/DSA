class Solution {
    public String compressedString(String word) {
        String comp = "";
        int i = 0;
        while (i < word.length()) {
            char ch = word.charAt(i);
            int count = 0;

            while (i < word.length() && word.charAt(i) == ch && count < 9) {
                count++;
                i++;
            }
            comp = comp + count + ch;
        }
        return comp;
    }
}