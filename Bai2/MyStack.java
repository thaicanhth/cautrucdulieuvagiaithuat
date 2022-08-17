package Bai2;

import java.util.EmptyStackException;

public class MyStack {
    private int[] stack;
    private int top;

    public MyStack(int capacity) {
        stack = new int[capacity];
    }

    public void push(int value) {
// check the stack is full
        if (top == stack.length) {
// need to resize the backing array
            int[] newArray = new int[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }
        stack[top++] = value;

    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int value = stack[top - 1];
        stack[top - 1] = 0;
        top--;
        return value;
    }

    public void printStack() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println("" + stack[i]);
        }
    }
}
