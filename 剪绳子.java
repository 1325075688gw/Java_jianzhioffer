package com.biggw.niuke;


/*题目描述
        给你一根长度为n的绳子，请把绳子剪成整数长的m段（m、n都是整数，n>1并且m>1），每段绳子的长度记为k[0],k[1],...,k[m]。请问k[0]xk[1]x...xk[m]可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。

        输入描述:
        输入一个数n，意义见题面。（2 <= n <= 60）

        输出描述:
        输出答案。

        示例1
        输入
        8

        复制
        18
*/


// 2*2*2<3*3
//由于题目规定m>1，所以2只能是1*1，3只能是2*1，这两个特殊情况直接返回就行了。
public class 剪绳子 {


    public static void main(String[] args) {
        剪绳子 obj = new 剪绳子();
        int i = obj.cutRope(8);
        System.out.println(i);
    }

    public int cutRope(int target) {
        if (target == 2) {
            return 1;
        }
        if (target == 3) {
            return 2;
        }
        int tmp = target % 3;
        if (tmp == 0) {
            return (int) Math.pow(3, target/3);
        }
        if (tmp == 1) {
            return (int) (2 * 2 * Math.pow(3, target/3-1));
        } else {
            return (int) (2 * Math.pow(3, target/3));
        }
    }
}
