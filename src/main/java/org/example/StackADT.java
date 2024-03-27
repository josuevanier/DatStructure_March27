package org.example;

public interface StackADT<T> {

    public void push(T element);
     T pop();

    T peek();

    int size();
    boolean isEmpty();
    String toString();

}
