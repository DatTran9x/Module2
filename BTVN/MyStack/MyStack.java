package BTVN.MyStack;

import java.util.LinkedList;

public class MyStack<E> {
    private int size ;
    private final LinkedList<E> elements;

    public MyStack() {
        elements = new LinkedList<>();
    }

    public void add(E e){
        elements.push(e);
    }

    public E pop(){
        return elements.pop();
    }

    public  E get(){
        return elements.getLast();
    }

    public boolean isEmpty(){
       return elements.isEmpty();
    }
}
