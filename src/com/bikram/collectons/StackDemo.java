package com.bikram.collectons;

import java.util.Stack;

public class StackDemo {

    //Stack implements LIFO
    //Push poop  peek

    public static void main(String[] args) {
        Stack<String> list=new Stack<>();
        list.push("Java");
        list.push("Python ");
        list.push("PERL");
        //look what is on top of stack

        System.out.println(list.peek());
        //retrieve and remove top element

        System.out.println(list.pop());//PERL
        System.out.println(list.pop());//Python
        System.out.println(list.pop());//Java
    }
}
