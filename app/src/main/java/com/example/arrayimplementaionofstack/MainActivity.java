package com.example.arrayimplementaionofstack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Simple example of stack Datastructure usage.
        
        Stack<Integer> stack = new Stack();
        stack.push(10);
        stack.push(11);
        stack.push(10);
        stack.push(21);
        stack.push(30);
        stack.push(111);
        Log.v("MainActivity","Stack:"+stack.peek());
        stack.pop();
        Log.v("MainActivity","Stack:"+stack.peek());
    }
}