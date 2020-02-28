package com.biggw.niuke;

import java.util.Arrays;
import java.util.Comparator;

// 在进行字符的排序和选择上，我们可以定义一个比较规则：
// 对于s1和s2，如果s1+s2 < s2+s1，就返回true。换句话说，排序按照使得两个字符串相加较小的次序进行排列。
public class 把数组排成最小的数 {

    public static void main(String[] args) {
        把数组排成最小的数 obj = new 把数组排成最小的数();
        int[] arr = new int[] {3334,3,3333332};
//        String s = obj.PrintMinNumber(arr);
        String s2 = obj.PrintMinNumber2(arr);
//        System.out.println(s);
        System.out.println(s2);
    }

    public String PrintMinNumber(int[] numbers) {
        if (numbers == null) {
            return "";
        }
        if (numbers.length == 1) {
            return String.valueOf(numbers[0]);
        }
        Integer[] arr = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = numbers[i];
        }
        Arrays.sort(arr, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                String str1 = o1+""+o2;
                String str2 = o2+""+o1;
                return str1.compareTo(str2);
            }
        });
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer integer : arr) {
            stringBuilder.append(integer);
        }
        return stringBuilder.toString();
    }

    public String PrintMinNumber2(int[] numbers) {
        if (numbers == null) {
            return "";
        }
        if (numbers.length == 1) {
            return String.valueOf(numbers[0]);
        }
        int len = numbers.length;
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < len-i; j++) {
                System.out.println(numbers[j] + "" + numbers[j + 1]);
                long str1 = Long.valueOf(numbers[j]+""+numbers[j+1]);
                long str2 = Long.valueOf(numbers[j+1]+""+numbers[j]);
                if (str1>str2) {
                    int t = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = t;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer integer : numbers) {
            stringBuilder.append(integer);
        }
        return stringBuilder.toString();
    }
}
//军港之夜