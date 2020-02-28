package com.biggw.niuke;

import java.util.Stack;


//题目描述
//        :用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。

// 结题思路：push时候没有关系，但是我们pop的时候，一定要注意。如果里面有元素，则直接输出，如果没有，则先从另一个队列中把数全部拿过来
public class 用两个栈实现队列 {


    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public static void main(String[] args) {
        用两个栈实现队列 obj = new 用两个栈实现队列();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        obj.push(5);
        System.out.println(obj.pop());
        System.out.println(obj.pop());

    }

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2 != null && stack2.size() != 0) {
            return stack2.remove(stack2.size()-1);
        } else {
            while (stack1.size()>0) {
                stack2.add(stack1.remove(stack1.size()-1));
            }
            return stack2.remove(stack2.size()-1);
        }
    }
}
