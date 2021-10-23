package com.example.arrayimplementaionofstack;

import android.util.Log;

public class Stack {

    int top;
    int capacity = 10;
    int[] array = new int[capacity];

    public void push(int element) {
        if(top >= capacity-1) {
            Log.v("Stack:","Stack overflow");
            return;
        }
        top++;
        array[top] = element;
    }

    public boolean pop() {
        if(top == -1) {
            Log.v("Stack:","Stack underflow");
            return false;
        }

        int x =  array[top];
        top--;
        Log.v("Stack:","Element is removed from stack:"+x);
        return true;
    }

    public void display() {
        for(int x=top;x>=1;x--) {
            Log.v("Stack:","Element in array:"+array[x]);
        }
    }

    public void peek() {
        if(top == -1) {
            Log.v("Stack:","Empty:");
        }
        int topelement = array[top];
        Log.v("Stack:","Top element:"+topelement);
    }
}
