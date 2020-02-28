package com.biggw.niuke;

import java.util.Arrays;

//题目描述：输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
public class 调整数组顺序使奇数位于偶数前面 {
    public static void main(String[] args) {
        调整数组顺序使奇数位于偶数前面 obj = new 调整数组顺序使奇数位于偶数前面();
        Solution solution = obj.new Solution();
        int[] arr = new int[] {1,3,4,5,2,6,7,8};
        solution.reOrderArray(arr);
        solution.reOrderArray2(arr);
        solution.reOrderArray3(arr);
    }

    // 希尔排序
    public class Solution {
        public int[] reOrderArray(int [] array) {

            int len = array.length;
            if (len==0) {
                return array;
            }
            if (len ==1) {
                return array;
            }
            int left=0,right=len-1;
            int mid = array[0];
            while (left<right) {
                while ((array[right]&1) == 0 && left<right) {
                    right--;
                }
                while ((array[left]&1) == 1 && left<right) {
                    left++;
                }
                int tmp = 0;
                tmp = array[right];
                array[right] = array[left];
                array[left] = tmp;
            }
            System.out.println(Arrays.toString(array));
            return array;

        }

        // 冒泡排序
        public int[] reOrderArray2(int [] array) {
            int len = array.length;
            if (len==0) {
                return array;
            }
            if (len ==1) {
                return array;
            }

            for (int i = 1; i < len; i++) {
                for (int j = 0; j < len-i; j++) {
                    if (((array[j]&1)==0) && ((array[j+1]&1)==1)) {
                        int tmp = 0;
                        tmp = array[j+1];
                        array[j+1] = array[j];
                        array[j] = tmp;
                    }
                }
            }
            System.out.println(Arrays.toString(array));
            return array;
        }

        // 冒泡排序增强
        public int[] reOrderArray3(int [] array) {
            int len = array.length;
            if (len==0) {
                return array;
            }
            if (len ==1) {
                return array;
            }

            for (int i = 1; i < len; i++) {
                boolean flag = false;
                for (int j = 0; j < len-i; j++) {
                    if (((array[j]&1)==0) && ((array[j+1]&1)==1)) {
                        flag = true;
                        int tmp = 0;
                        tmp = array[j+1];
                        array[j+1] = array[j];
                        array[j] = tmp;
                    }
                }
                if (flag==false) {
                    break;
                }
            }
            System.out.println(Arrays.toString(array));
            return array;
        }
    }





    }
