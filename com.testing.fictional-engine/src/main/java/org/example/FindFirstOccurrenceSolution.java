package org.example;

public class FindFirstOccurrenceSolution {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
        System.out.println(strStr("leetcode", "leeto"));
        System.out.println(strStr("aaa", "aaaa"));
        System.out.println(strStr("mississippi", "issip"));
    }


    private static int strStr(String haystack, String needle) {
        int haylength = haystack.length();
        int needlelength = needle.length();
        if (haylength < needlelength) return -1;
        int lengthDiff = haylength - needlelength;
        for (int i = 0; i <= lengthDiff; i++) {
            int j = 0;
            while (j < needlelength && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
                if (j == needlelength) {
                    return i;
                }
            }
        }
        return -1;
    }
}
