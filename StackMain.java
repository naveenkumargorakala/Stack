package com.bridgelabz.DataStructures.Stack;

public class StackMain<T> {
    public static void main(String[] args) {
        StackOperations<Integer> stackOperations= new StackOperations();
        stackOperations.push(70);
        stackOperations.push(30);
        stackOperations.push(56);
        stackOperations.show();
        int peek=3;
        for(int i=0;i<peek;i++) {
            System.out.println(i);
            int s=stackOperations.pop();
            stackOperations.show();
        }
    }
}
