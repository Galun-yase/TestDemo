package com.chengzi.Test;

import com.chengzi.Stack.LinkedStack;

public class LinkedStackTest {
    public static void main(String[] args){
        LinkedStack<Integer> lstack=new LinkedStack<>();
        lstack.push(1);
        lstack.push(2);
        lstack.push(3);
        lstack.push(4);
        lstack.push(5);
        lstack.push(6);

        System.out.println(lstack);
        System.out.println(lstack.peek());
        lstack.pop();
        lstack.pop();
        System.out.println(lstack);
    }
}
