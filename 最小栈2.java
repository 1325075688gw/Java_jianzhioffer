package com.biggw.niuke;

import java.util.Stack;

public class 最小栈2 {
    private Stack<Integer> stack = new Stack<Integer>();
    private int min;

    public void push(int x) {
        if (stack.isEmpty()) {
            min = x;
            stack.push(0);
        } else {
            // 计算差值
            int compare = x - min;
            stack.push(compare);
            // 如果差值小于0，显然 x 成为最小值，否则最小值不变
            min = compare < 0 ? x : min;
        }
    }

    public void pop() {
        int top = stack.peek();
        // 如果top小于0，显然最小值也一并会被删除，此时更新最小值
        min = top < 0 ? (min - top) : min;
        stack.pop();
    }

    public int getMin() {
        return min;
    }
}
