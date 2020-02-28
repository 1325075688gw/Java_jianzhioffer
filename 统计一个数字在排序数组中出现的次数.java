package com.biggw.niuke;

public class 统计一个数字在排序数组中出现的次数 {
    public static void main(String[] args) {
        统计一个数字在排序数组中出现的次数 obj = new 统计一个数字在排序数组中出现的次数();
        Solution solution = obj.new Solution();
        int[] arr = new int[]{3, 3, 3, 3, 4, 5};
        System.out.println(solution.GetNumberOfK(arr, 3));
        System.out.println(solution.GetNumberOfK2(arr, 3));
    }

    public class Solution {
        public int GetNumberOfK(int[] array, int k) {

            if (array.length == 0) {
                return 0;
            }
            if (array.length == 1) {
                return array[0] == k ? 1 : 0;
            }

            int left = 0;
            int right = array.length - 1;
            int mid = 0;
            int count = 0;
            while (left < right) {
                mid = left + (right - left) / 2;
                if (array[mid] == k) {
                    count++;
                    break;
                } else if (array[mid] < k) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            int leftNum = mid;
            int rightNum = mid;
            while (0 < leftNum) {
                if (array[--leftNum] == k) {
                    count++;
                } else {
                    break;
                }
            }
            while (rightNum < array.length - 1) {
                if (array[++rightNum] == k) {
                    count++;
                } else {
                    break;
                }
            }

            return count;
        }

        public int GetNumberOfK2(int[] array, int k) {

            int res = func(array, k + 0.1) - func(array, k - 0.1);
            return res;
        }

        public int func(int[] arr, double k) {
            int left = 0, right = arr.length - 1;
            int mid;
            while (left <= right) {
                mid = left + (right - left) / 2;
                if (arr[mid] == k) {
                    break;
                } else if (arr[mid] > k) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return left;
        }
    }
}
