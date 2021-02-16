class Solution {
    public int numberOfMatches(int n) {
        int matches = 0;

        while (n > 1) {
            if (n % 2 == 0) {// even case
                n = (n / 2); // teams which advance even
                matches += n;
            } else {
                matches += ((n - 1) / 2);
                n = ((n - 1) / 2) + 1; // teams advanced uneven

            }
        }
        return matches;
    }
}
