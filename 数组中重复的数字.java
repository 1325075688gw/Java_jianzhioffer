package com.biggw.niuke;

public class 数组中重复的数字 {
    public static void main(String[] args) {

        数组中重复的数字 obj = new 数组中重复的数字();
        int[] arr = new int[]{2,3,1,0,2,5,3};
        int[] duplication = {-1};
        obj.duplicate(arr,arr.length, duplication);
        System.out.println(duplication[0]);

    }

    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if (length == 0) {
            return false;
        }
        int index;
        int temp;
        for (int i = 0; i < numbers.length; i++) {
            index = numbers[i];
            temp = index;
            if (index>=length) {
                index = numbers[i]-length;
            }
            if (numbers[index]>=length){
                duplication[0] = index;
                return true;
            }
            numbers[index] += length;
        }
        return false;
    }
}
