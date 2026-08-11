class Solution {

    boolean isPalindrome(String s) {
        s= s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        return check(s, 0);
    }

    boolean check(String s, int i) {
        if (i >= s.length() / 2)
            return true;

        if (s.charAt(i) != s.charAt(s.length() - i - 1))
            return false;

        return check(s, i + 1);
    }
}