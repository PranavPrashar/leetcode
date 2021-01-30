class Solution {
    public List<String> fizzBuzz(int n) {
        String threeFizz = "Fizz";
        String fiveBuzz = "Buzz";

        List<String> list = new ArrayList<String>();

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add(threeFizz);
            } else if (i % 5 == 0) {
                list.add(fiveBuzz);
            } else {
                list.add("" + i);
            }

        }
        return list;
    }
}