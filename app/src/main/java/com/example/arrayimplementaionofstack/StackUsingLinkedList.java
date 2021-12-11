package com.example.arrayimplementaionofstack;

import android.util.Log;

public class StackUsingLinkedList {

    //Global reference to top
    private Node top;

    public void push(int element) {

        Node node = new Node();

        node.data = element;
        node.link = top;

        node = top;
    }

    public void pop() {
        if (top == null) {
            Log.v("Stack", " Stack is empty");
        }

        top = top.link;
    }

    public void peek() {

    }

    private class Node {
        int data;
        Node link;

        
    }
}

