package com.biggw.niuke;

//题目描述： 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
public class 二进制中1的个数 {
    public class Solution {
        public int NumberOf1(int n) {
            int count = 0;
            char[] chars = Integer.toBinaryString(n).toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '1') {
                    count++;
                }
            }
            return count;
        }

        public int NumberOf12(int n) {
            int count = 0;
            while (n!=0) {
                n = n & (n-1);
                count++;
            }
            return count;
        }
    }
}
