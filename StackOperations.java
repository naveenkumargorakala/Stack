package com.bridgelabz.DataStructures.Stack;

import com.bridgelabz.DataStructures.Linkedlist.Node;

public class StackOperations<T> {
    StackNode<T> top;

    public void push(T data) {
        StackNode<T> newNode = new StackNode(data);
        if (top == null)
            top = newNode;

        else {
            newNode.next =top ;
            top=newNode;
        }
    }

    public T pop() {
        T popData = top.data;
        if (top == null) {
            return null;
        } else if (top.next == null) {
            return null;
        } else
            top = top.next;

        return popData;
    }

    public void show(){
        StackNode<T> temp = top;
        while(temp!=null){
            System.out.print("<-"+temp.data);
            temp=temp.next;
        }
        System.out.println();
    }
}
