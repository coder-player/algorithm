package com.fqh.java.homework.lab5;


/**
 * @author 我劝你荔枝_FQH
 * @version 1.0
 * Date: 2022/5/3 14:26:50
 */
public class Demo05 {

    public static void main(String[] args) {

        MyString str1 = new MyString("abc");
        MyString str2 = new MyString("abc");
        System.out.println(str1.compare(str2) == 1 ? "相等" : "不相等");
    }

    static class MyString {
        private final char[] value;

        public MyString(String s) {
            this.value = s.toCharArray();
        }

        public int compare(MyString str) {
            char[] chars1 = str.getChars();
            if (this.value.length != chars1.length) {
                return 0;
            }
            for (int i = 0; i < chars1.length; i++) {
                if (this.value[i] != chars1[i]) {
                    return 0;
                }
            }
            return 1;
        }
        public char[] getChars() {
            return value;
        }
    }
}
