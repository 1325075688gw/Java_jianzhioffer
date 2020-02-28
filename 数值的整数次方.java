package com.biggw.niuke;


//题目描述:给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。保证base和exponent不同时为0
public class 数值的整数次方 {
    public static void main(String[] args) {
        数值的整数次方 obj = new 数值的整数次方();
        Solution solution = obj.new Solution();
        System.out.println(solution.Power(2, 5));
        System.out.println(solution.Power2(2,-3));
    }
    public class Solution {
        public double Power(double base, int exponent) {

            if (exponent==0) {
                return 1;
            }
            if (exponent==1){
                return base;
            }
            if (exponent==2) {
                return base*base;
            }
            int count = 2;
            double raw = base;
            while (count<=Math.abs(exponent)) {
                base = base*base;
                count = count*2;

            }
            if (Math.abs(exponent)%2==1) {
                base = base*raw;
            }
            if (exponent<0) {
                return 1/base;
            } else {
                return base;
            }
        }

        public double Power2(double base, int exponent) {

            double raw = base;
            int e = Math.abs(exponent);
            if (exponent==0) {
                return 1;
            }
            if (exponent==1){
                return base;
            }
            if (exponent==2) {
                return base*base;
            }

            while (e>1)  {
                raw *= raw;
                e >>= 1;
            }
            if (e==1) {
                raw = raw*base;
            }
            return exponent>0? raw:1/raw;
        }
    }
}
