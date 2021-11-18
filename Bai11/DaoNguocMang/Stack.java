package Bai11.DaoNguocMang;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class Stack<E> {
    private final LinkedList<E> stack;

    public Stack() {
        stack = new LinkedList<>();
    }

    public void push(E element){
        stack.addFirst(element);
    }

    public int size(){
        return stack.size();
    }

    public E pop(){
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.pop();
    }

    public void pushWord(E element){
        stack.push(element);
    }

    public E popWord(){
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.pop();
    }
}
