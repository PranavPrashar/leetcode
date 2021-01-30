class Solution {
    public boolean isPalindrome(int x) {
        long result = 0;
        int value = x;
        while (x != 0) {
            result = (result * 10) + (x % 10);
            x = x / 10;
        }
        System.out.println(result);

        if (result == value && value >= 0) {
            return true;
        } else {
            return false;
        }

    }
}