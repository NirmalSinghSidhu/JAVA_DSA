package com.nirmal.stacks;

public class Stack {
    private int size; // size of the stack
    private int[] array; // stack storage
    private int top; // top of the stack

    // Constructor
    public Stack(int size){
        this.size = size;
        array = new int[size]; //initialize array
        top = -1; //stack is initially empty
    }
    // Operation : Push
    // push item on the top of the stack
    public void push(int data) {
        if(!isFull()){
            // increment top by 1 and insert data
            array[++top] = data;
        }else{
            System.out.println("Cannot add data. Stack is full.");
        }
    }
    // Operation : Pop
    // pop item from the top of the stack
    public int pop() {
        if(isEmpty()){
            //System.out.println("Cannot pop as stack is already empty so returning -1");
            return -1;
        }
        //retrieve data and decrement the top by 1
        return array[top--];
    }
    // Operation : Peek
    // view the data at top of the stack
    public int peek() {
        if(isEmpty()){
            //System.out.println("Cannot perform peek() as stack is already empty so returning -1");
            return -1;
        }
        //retrieve data from the top
        return array[top];
    }
    // Operation : isFull
    // return true if stack is full
    public boolean isFull(){
        return (top == size-1);
    }

    // Operation : isEmpty
    // return true if stack is empty
    public boolean isEmpty(){
        return (top == -1);
    }

    public int size(){
        return top+1;
    }
}
