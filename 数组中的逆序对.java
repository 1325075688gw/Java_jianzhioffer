package com.biggw.niuke;

import java.util.ArrayList;
import java.util.Arrays;

public class 数组中的逆序对 {
    int count = 0;
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,6,7,4,5};
        int[] ints = Arrays.copyOfRange(arr, 0, 2);

        System.out.println(Arrays.toString(ints));
        数组中的逆序对 obj = new 数组中的逆序对();
        int i = obj.InversePairs(arr);
        System.out.println(i);
    }


    public int InversePairs(int[] array) {
        int[] ints = mergeSort2(array);
        System.out.println(Arrays.toString(ints));
        return count;
    }

//    public int[] mergeSort(int[] array) {
//        if (array.length <= 1) {
//            return array;
//        }
//        int left = 0, right = array.length;
//        int mid = left + (right - left) / 2;
//        int[] leftArr = mergeSort(Arrays.copyOfRange(array, 0, mid));
//        int[] rightArr = mergeSort(Arrays.copyOfRange(array, mid, right));
//        int[] arr = merge(leftArr, rightArr);
//        return arr;
//    }
//
//    public int[] merge(int[] arr1, int[] arr2) {
//        int r = 0;
//        int l = 0;
//        int[] arr = new int[arr1.length+arr2.length];
//        int num=0;
//        while (l < arr1.length && r < arr2.length) {
//            if (arr1[l] < arr2[r]) {
//                arr[num++]= arr1[l];
//                l++;
//            } else {
//                arr[num++] = arr2[r];
//                r++;
//                count += (arr1.length-l);
//            }
//        }
//        while (l<arr1.length) {
//            arr[num++] =arr1[l];
//            l++;
//        }
//        while (r<arr2.length) {
//            arr[num++] =arr2[r];
//            r++;
//        }
//        return arr;
//    }

    public int[] mergeSort2(int[] array) {
        if (array.length <= 1) {
            return array;
        }
        int left = 0, right = array.length;
        int mid = left + (right - left) / 2;
        int[] leftArr = mergeSort2(Arrays.copyOfRange(array, 0, mid));
        int[] rightArr = mergeSort2(Arrays.copyOfRange(array, mid, right));

        int r = 0;
        int l = 0;
        int[] arr = new int[leftArr.length+rightArr.length];
        int num=0;
        while (l < leftArr.length && r < rightArr.length) {
            if (leftArr[l] < rightArr[r]) {
                arr[num++]= leftArr[l];
                l++;
            } else {
                arr[num++] = rightArr[r];
                r++;
                count += (leftArr.length-l);
            }
        }
        while (l<leftArr.length) {
            arr[num++] =leftArr[l];
            l++;
        }
        while (r<rightArr.length) {
            arr[num++] =rightArr[r];
            r++;
        }
        return arr;
    }
}

/*
count = 0
class Solution:
    def InversePairs(self, data):
        global count
        def MergeSort(lists):
            global count
            if len(lists) <= 1:
                return lists
            num = int( len(lists)/2 )
            left = MergeSort(lists[:num])
            right = MergeSort(lists[num:])
            r, l=0, 0
            result=[]
            while l<len(left) and r<len(right):
                if left[l] < right[r]:
                    result.append(left[l])
                    l += 1
                else:
                    result.append(right[r])
                    r += 1
                    count += len(left)-l
            result += right[r:]
            result += left[l:]
            return result
        MergeSort(data)
        return count%1000000007
 */
