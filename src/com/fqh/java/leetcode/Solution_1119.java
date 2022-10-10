package com.fqh.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 海盗狗
 * @version 1.0
 * 1119. 删去字符串中的元音 [PLUS]
 * 输入：s = "leetcodeisacommunityforcoders"
 * 输出："ltcdscmmntyfrcdrs"
 */
public class Solution_1119 {

    public static void main(String[] args) {

    }

    public static String removeVowels(String s) {
        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('u');
        list.add('o');
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(!list.contains(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
