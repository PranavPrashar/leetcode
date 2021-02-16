//1295. Find Numbers with Even Number of Digits

class Solution {
    public int findNumbers(int[] nums) {
        int counter = 0;

        for (int value : nums) {
            int numTimes = 0;
            while (value != 0) {
                value = value / 10;
                numTimes++;
            }

            if (numTimes % 2 == 0) {
                counter++;
            }
        }

        return counter;
    }

}
