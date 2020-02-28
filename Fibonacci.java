package com.biggw.niuke;


// 数列的第一个是0和第二个数是1，接下来每个数都等于前面2个数之和。
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fibonacci(2));
    }

    public static int Fibonacci(int n) {
        if (n==0) return 0;
        if (n==1) return 1;

        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < n+1; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}
