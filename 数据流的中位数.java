package com.biggw.niuke;

import java.util.PriorityQueue;
import java.util.Queue;

public class 数据流的中位数 {


    Queue<Integer> minQueue =  new PriorityQueue<Integer>();
    Queue<Integer> maxQueue =  new PriorityQueue<Integer>();
    public void Insert(Integer num) {
        minQueue.add(num);
        maxQueue.add(-minQueue.poll());
        if (maxQueue.size() > minQueue.size()) {
            minQueue.add(-maxQueue.poll());
        }
    }

    public Double GetMedian() {
        int minLen = minQueue.size();
        int maxLen = maxQueue.size();

        if (minLen==maxLen) {
            return (minQueue.peek()+ (-maxQueue.peek()))/2.0;
        } else {
            return minQueue.peek()* 1.0;
        }
    }
}
