package com.biggw.niuke;

public class 整数中只出现一次的数字 {
    public class Solution {
        // Java：数组也属于对象，对象作为参数传递给方法时，传递的实际上就是该数组对象的引用在方法中对数组的所有操作，都会映射到原数组中。但是除了对象（数组），其他基本数据类型没有此特征。
        public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
            int start = 0;
            for (int i : array) {
                start ^= i;
            }
            // 首先我们要明确，两个不相同的数，异或不可能为0，所以里面一定有1一个以上1
            int index = 0;
            // 查找第一个1出现的位置
            while (true) {
                if ((start & 1) == 0) {
                    start >>= 1;
                    index++;
                } else {
                    // 一开始从这儿退出，说明第一个1所在的位置就是索引0处。也就是异或结果为1
                    break;
                }
            }

            int a = 0, b = 0;
            for (int i : array) {
                if (((i>>index)&1)==1) {
                    a ^= i;
                }
                else {
                    b ^= i;
                }
            }


        }
    }
}
