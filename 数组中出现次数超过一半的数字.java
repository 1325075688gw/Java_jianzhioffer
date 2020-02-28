package com.biggw.niuke;

import java.util.Objects;

public class 数组中出现次数超过一半的数字 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,5,6};
        数组中出现次数超过一半的数字 obj = new 数组中出现次数超过一半的数字();
        int i = obj.MoreThanHalfNum_Solution(arr);
        System.out.println(i);
    }

    public int MoreThanHalfNum_Solution(int[] array) {
        Integer tmp = null;
        int count = 0;

        for (int i : array) {
            if (Objects.equals(tmp,i))
                count++;
            else {
                if (count==0) {
                    tmp = i;
                    count = 1;
                }else count--;
            }
        }
        int times = 0;
        for (int i : array) {
            if (tmp == i) {
                times++;
            }
        }
        if (times>array.length/2){
            return tmp;
        }

        return 0;
    }
}
