package demo;

import java.util.EmptyStackException;

public class MyStack {
    private int[] stack;
    private int top;

    public MyStack(int capacity){
        stack = new int [capacity];
    }
    public void push(int value){
        if (top == stack.length){
            int[] newArray = new int[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }
        stack[top++] = value;
    }
    public boolean isEmpty() {
        return top == 0;
    }
    public int pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        int value = stack[top - 1];
        stack[top - 1] = 0;
        top--;
        return value;
    }
    public void printStack(){
        for (int i = top - 1; i >= 0; i--){
            System.out.printf(""+ stack[i]);
        }
    }
}















