package com.biggw.niuke;


import java.util.ArrayList;
import java.util.PriorityQueue;

//题目描述:输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
// 最小堆实现
public class 最小的K个数 {
    public static void main(String[] args) {
        最小的K个数 obj = new 最小的K个数();
        int[] arr = new int[] {34,3,33,2,4,5};
        obj.GetLeastNumbers_Solution(arr, 2);
    }

    // 可以自定义比较器
    // 最大堆
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> integers = new ArrayList<>();
        if (input==null || k>input.length) return integers;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i : input) {
            queue.add(-i);
            if (queue.size()>k) {
                queue.poll();
            }
        }
        while (queue.size()>0) {
            integers.add(-queue.poll());
        }
        return integers;

    }
}
