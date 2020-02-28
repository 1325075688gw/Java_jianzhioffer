package com.biggw.niuke;

public class 变态跳台阶 {
    public static void main(String[] args) {
        JumpFloorII(5);
    }

    public static int JumpFloorII(int target) {


        int[] dp = new int[target+1];
        dp[1] = 1;
        for (int i = 2; i < target+1; i++) {
            dp[i] = 2*dp[i];
        }
        return dp[target];
    }
}
