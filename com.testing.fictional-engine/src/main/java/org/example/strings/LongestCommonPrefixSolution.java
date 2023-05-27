package org.example.strings;

import java.util.Arrays;
import java.util.Objects;

public class LongestCommonPrefixSolution {
    public static void main(String[] args) {

        System.out.println("longest" + longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        final String first = strs[0];
        final String last = strs[strs.length - 1];
        int idx = 0;
        while (first.length() > idx && last.length() > idx) {
            if (first.charAt(idx) == last.charAt(idx)) {
                idx++;
            } else {
                return strs[0].substring(0, idx);
            }
        }
        return strs[0].substring(0, idx);
    }
}
