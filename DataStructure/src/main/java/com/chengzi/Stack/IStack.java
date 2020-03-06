package com.chengzi.Stack;

public interface IStack<T> {
    T push(T data);
    T pop();
    T peek();
    int getSize();
    boolean isEmpty();
    boolean isFull();
}
