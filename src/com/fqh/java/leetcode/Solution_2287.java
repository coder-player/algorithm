package com.fqh.java.leetcode;

import java.util.Arrays;

/**
 * @author 我劝你荔枝_FQH
 * @version 1.0
 * Date: 2022/6/9 15:49:09
 */
public class Solution_2287 {

    public static void main(String[] args) {

       String s = "ilovecodingonleetcode", target = "code";
       rearrangeCharacters(s, target);
    }

    public static int rearrangeCharacters(String s, String target) {
        char[] chs = new char[s.length()];
        int i = 0;
        for (char c : s.toCharArray()) {
            chs[i++] = c;

        }
        Arrays.sort(chs);
        String s1 = String.valueOf(chs);
        System.out.println(s1);
        i = 0;
        char[] chs2 = new char[target.length()];
        for (char c : target.toCharArray()) {
            chs2[i++] = c;

        }
        Arrays.sort(chs2);
        String s2 = String.valueOf(chs2);



        return -1;
    }
}
