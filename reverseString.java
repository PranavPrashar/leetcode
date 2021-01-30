class Solution {
    public void reverseString(char[] s) {

        if (s == null || s.length <= 1) {
            return;
        }
        int size = s.length;

        for (int i = 0; i < size / 2; i++) {
            char temp = s[i];
            s[i] = s[size - 1 - i];
            s[size - 1 - i] = temp;

        }

    }
}