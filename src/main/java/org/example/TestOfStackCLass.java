package org.example;

import java.util.Stack;

public class TestOfStackCLass {
    public static void main(String[] args) {

        Stack s = new Stack();

        s.add("vanier");
        s.add('c');
        s.pop();

        s.push(1);

        System.out.println(s);
    }
}
