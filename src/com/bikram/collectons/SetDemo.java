package com.bikram.collectons;

import java.util.*;

public class SetDemo {
    //set is a collection of Unique elements
    public static void main(String[] args) {
        Set s1=new HashSet<>();
        s1.add("CSE");
        s1.add("ECOM");
        s1.add("PHY");
        System.out.println(s1);

        Set s2= new LinkedHashSet();
        s2.add("Japan");
        s2.add("Australia");
        s2.add("USA");
        System.out.println(s2);

        SortedSet<String> s3=new TreeSet();
        s3.add("AUS");
        s3.add("USA");
        s3.add("JPN");
        s3.add("AUS");
        s3.add("COM");
        System.out.println(s3);

    }
}
