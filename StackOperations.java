package com.bridgelabz.DataStructures.Stack;

public class StackOperations<T> {
    StackNode<T> top;
    public void push(T data){
        StackNode<T> newNode = new StackNode(data);
        if(top==null)
            top=newNode;

        else {
            top.next=newNode;
           newNode=top;
        }
    }

    public void show(){
        StackNode<T> temp = top;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println();
    }
}
