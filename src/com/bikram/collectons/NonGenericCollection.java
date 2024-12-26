package com.bikram.collectons;

import java.awt.print.Book;
import java.util.ArrayList;

public class NonGenericCollection {
    /*
    -->CollectionFramework in java holds classes and interfaces for creating Dynamic Collection of data.

        1. Data Structure : Array.LinkedList,tree,Queue,set, table,map
        2. Unified Architecture : Similar methods and functionalities
        3. Build-in Algorithms : search,sort,push,pop

     */
    public static void main(String[] args) {
       // Non-generic collection refers to a type of collection where no type safety is in place

       ArrayList al= new ArrayList();
       al.add(123);
       al.add(45.55);
       al.add('c');
       al.add("yes");
       al.add(new Book());
       //we  can add anything in this type of collection
        // this collection is not type safe

        //Generic collection is a type of collection ehich we can define to put any specifiec
        //type of values only

        ArrayList<Integer> all =new ArrayList<Integer>();
        all.add(123);
        all.add(852);
        all.add(859);
        // all.add(25.25) cannot add other of value

        System.out.println("First Element :"+all.get(0));
        System.out.println("Size of collectionn :"+all.size());
        System.out.println("Last element :"+all.getLast());
        System.out.println("Does the collection contains 123?"+all.contains(123));
        //add elements in any position
        all.add(1,753);//add elements 753 in index 1,i.e second position
        //but is not efficient to add elements other than last position

    }


}
