package com.example.arrayimplementaionofstack;

import android.util.Log;

public class Stack {

    private final String TAG = Stack.class.getSimpleName();
    int top;
    int capacity = 10;
    int[] array = new int[capacity];

    public void push(int element) {
        if(top >= capacity-1) {
            Log.v(TAG,"Stack overflow");
            return;
        }
        top++;
        array[top] = element;
    }

    public boolean pop() {
        if(top == -1) {
            Log.v(TAG,"Stack underflow");
            return false;
        }

        int x =  array[top];
        top--;
        Log.v(TAG,"Element is removed from stack:"+x);
        return true;
    }

    public void display() {
        for(int x=top;x>=1;x--) {
            Log.v(TAG,"Element in array:"+array[x]);
        }
    }

    public void peek() {
        if(top == -1) {
            Log.v("TAG","Empty:");
        }
        int topelement = array[top];
        Log.v(TAG,"Top element:"+topelement);
    }
}
