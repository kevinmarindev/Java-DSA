package stackoperations;

import java.util.NoSuchElementException;

public class LinkedStack implements Stack{

    private class Node{
        int plate;
        Node next;
        public Node(int current){
            plate = current;
        }
    }

    public Node top;
    //constructor for class starts the list
    public LinkedStack(){
        top = null;
    }

    @Override
    public void push(int plate){
        Node newTop = new Node(plate);
        newTop.next = this.top;
        this.top = newTop;
    }

    @Override
    public int pop(){
        Node oldTop = this.top;
        this.top = this.top.next;
        return oldTop.plate;
    }

    @Override
    public boolean isEmpty(){
        return top == null;
    }

    @Override
    public int peek(){
        if(this.top == null){
            throw new NoSuchElementException();
        }
        return this.top.plate;
    }

    @Override
    public int size(){
        int size = 0;
        Node current = this.top;
        while(current.next != null){
            size++;
            current = current.next;
        }
        return size;
    }
}
