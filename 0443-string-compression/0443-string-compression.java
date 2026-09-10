class Solution {
    public int compress(char[] chars) {
        int index = 0;
        for (int i = 0; i < chars.length; i++) {

            char ch = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == ch) {
                count++;
                i++;
            }
            chars[index++] = ch;
            if (count > 1) {
                String s = String.valueOf(count);

                for (char c : s.toCharArray()) {
                    chars[index++] = c;
                }
            }
            i--;
        }
        return index;
    }
}