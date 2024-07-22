package com.personal.datastructure;

/*
Stack Impl with basic functionalities of push and pop
 */
public class StackImpl {
    int top;
    int n;
    char[] a;

    public StackImpl(int size){
        top = -1;
        n = size;
        a = new char[size];
    }

    public boolean isEmpty(){
        return top < 0;
    }

    public boolean push(char c) {
        try{
        if (top == n-1){
            System.out.println("Stack OverFlow");
            return false;
        }
        else {
            a[++top]=c;
            return true;
        }
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(" Stack Overflow  :"+e.getMessage());
            return false;
        }

    }

    public char pop(){
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            char x = a[top--];
            System.out.print(x);
            return x;
        }
    }
    public void printElements(){
        System.out.println("Elements in stack:");
        for(int i = 0 ; i <= top ; i++){
            System.out.print(a[i]);
        }
    }

    public static void main(String[] args) {
        StackImpl s = new StackImpl(5);
        s.push('z');
        s.push('k');
        s.push('r');
        s.push('w');
        s.printElements();
        s.pop();
        System.out.println("After 1 pop");
        s.printElements();
    }
}
