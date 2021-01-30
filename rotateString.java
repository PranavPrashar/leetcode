class Solution {
    public boolean rotateString(String A, String B) {
        String value = A + A;

        if (A.length() == B.length() && (A + A).contains(B)) {
            return true;
        }

        return false;
    }
}

// if A = abcde then A+A becomes abcdeabcde where B is cdeab and the concatone
// of a+a contains the substring b

// bcdea

// cdeab