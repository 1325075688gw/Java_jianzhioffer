package com.biggw.niuke;

// 由于A-Z对应的ASCII码为65-90，a-z对应的ASCII码值为97-122,ASCII码中的90-96不是字母 但是为了统一减65来计算 所以要再加上6个长度 不然就要判断是否是小写字母 小写字母要减65再减6
public class 第一个只出现一次的字符 {
    public static void main(String[] args) {
        第一个只出现一次的字符 obj = new 第一个只出现一次的字符();
        System.out.println('a');
        System.out.println((int)'a');
        int google = obj.FirstNotRepeatingChar("google");
        System.out.println(google);
    }

    public int FirstNotRepeatingChar(String str) {

        int[] arr = new int[58];
        for (int i = 0; i < str.length(); i++) {
            // 转换为 ASCII码
            arr[(int)str.charAt(i)-65] += 1;
        }
        for (int i = 0; i < str.length(); i++) {
            if ((int)arr[str.charAt(i)-65] == 1) {
                return i;
            }
        }
        return -1;
    }
}
