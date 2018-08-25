package com.date.structure;

import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> conter = new LinkedList<>();

    //压栈
    public void push(T t) {
        conter.addFirst(t);
    }

    //出栈
    public T pop() {
        return conter.removeFirst();
    }

    //判断链表是否为空
    public boolean isEmpty() {
        return conter.isEmpty();
    }

}
