package com.bikram.collectons;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class ListDemo {

    public static void main(String[] args) {


        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Suresh");
        list1.add("Dipak");
        list1.add("Pravash");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        System.out.println("--------------------------------------------");
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Sabita");
        list2.add("Ranita");
        list2.add("Anjali");
        for (String name : list2) {
            System.out.println(name);
        }
        System.out.println("----------------------------------------------");


        list1.addAll(list2);
        //all elements of list2 are copied into list 1,merge list


        Iterator<String> it = list1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("-----------------------------------------------");

        // list1.removeAll(list2);
        //removes common elements between list1 and list 2 from list1

        list1.retainAll(list2);
        //preserves common element between list 1 and list 2 in list 1

        System.out.println(list1);

        //stack as a collection

        Stack<Double> data = new Stack<>();
        data.push(21.33);
        data.push(33.33);
        data.push(44.44);
        System.out.println(data.pop());
        System.out.println(data.pop());
        System.out.println(data.pop());
        System.out.println(data.pop());//throws an exception when pop from empty
    }
}