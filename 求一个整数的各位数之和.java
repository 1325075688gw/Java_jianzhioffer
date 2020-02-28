package com.biggw.niuke;

public class 求一个整数的各位数之和 {


    public static void main(String[] args) {
        int sum = sum(123);
        System.out.println(sum);
    }

    private static int sum(int i) {
        int tmp = 0;
        do {
            tmp += i%10;
        } while ((i=i/10)>0);
        return tmp;
    }
}
