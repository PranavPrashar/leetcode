//1684. Count the Number of Consistent Strings

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int counter = 0;
        Set<Character> setter = new HashSet<Character>();

        for (char letts : allowed.toCharArray()) {
            setter.add(letts);
        }
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (!setter.contains(word.charAt(i))) {
                    break;
                }

                if (i == word.length() - 1) {
                    counter++;
                }
            }
        }
        return counter;

    }
}
