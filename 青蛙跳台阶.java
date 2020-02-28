package com.biggw.niuke;


//题目描述:一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
public class 青蛙跳台阶 {

    public static void main(String[] args) {
        System.out.println(JumpFloor(6));
        System.out.println(JumpFloor2(5));
    }

    public static int JumpFloor(int target) {
        if (target < 2) return target;
        return JumpFloor(target-1) + JumpFloor(target-2);

    }

    public static int JumpFloor2(int target) {
        int[] arr = new int[target+1];
        arr[1] = 1;
        arr[2] = 2;
        // 对于这种动态规划，我们要求到target这个值，也就是说dp【target】需要求。所以我们一开始在定义数组时候就必须多定义一个元素，然后数组元素从下标1开始
        for (int i =3; i < target+1; i++) {
            arr[i] = arr[i-1]+ arr[i-2];
        }
        return arr[target];

    }
}
