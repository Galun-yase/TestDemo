package com.chengzi.Test;

import com.chengzi.Stack.SequenceStack;

public class SequenceStackTest {
    public static void main(String[] args){
        SequenceStack<String> stack=new SequenceStack(10);
        stack.push("a");
        stack.push("b");
        stack.push("c");
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
        stack.pop();
        stack.pop();

        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("a");
        stack.push("b");
        stack.push("c");
    }
}
