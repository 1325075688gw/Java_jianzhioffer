package com.biggw.niuke;


//设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
//
//        push(x) -- 将元素 x 推入栈中。
//        pop() -- 删除栈顶的元素。
//        top() -- 获取栈顶元素。
//        getMin() -- 检索栈中的最小元素。

import java.util.Stack;

// 一个栈正常push pop，另外一个栈记录第一个栈中出现的最小元素
public class 最小栈 {
    Stack<Integer> stack1 =  new Stack<Integer>();
    Stack<Integer> stack2 =  new Stack<Integer>();
    public void push(int node) {
        stack1.push(node);
        if(stack2.empty() || node < stack2.peek()) {
            stack2.push(node);
        }
    }

    public void pop() {
        if(stack1.peek().equals(stack2.peek())){
            stack2.pop();
        }
        stack1.pop();
    }

    public int top() {
         return stack1.peek();
    }

    public int min() {

        return stack2.peek();
    }
}
