package org.example.palindrome;

public class Palindrome {
    public static void main(String[] args) {
        int value = 121;
        System.out.println("Substring: " + isPalindrome(value));

    }

    public static boolean isPalindrome(int x) {
        final String s = String.valueOf(x);
        final int n = s.length();
        for (int i = 0; i < n/2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}