package com.bikram.arrays;

import java.util.Arrays;

public class ArrayStatic {

    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 23;
        nums[1] = 21;
        nums[2] = 54;
        nums[3] = 55;
        nums[4] = 69;
        // nums[5]=14; //Exception occurs and terminates a program
        for (int e : nums) {
            System.out.println(e + "\t");
        }
        System.out.println("......................................");
        //when we know the values for an array elements then we can declare array statically

        int[] odds = {1, 3, 5, 7, 9};//statically decleared array
        for (int e : odds) {
            System.out.print(e + "\t");
        }
        System.out.println("....................................");
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};//char[] vowels;
        // vowels= new char[]{'a', 'e', 'i', 'o', 'u'};
        //declaration and initialization separately
        String[] positions;
        positions = new String[]{"First", "Second", "Third"};

        //to display arrays we can use class helper such as Array and Arrays
        System.out.println(Arrays.toString(vowels));
        System.out.println(Arrays.toString(positions));
        System.out.println("..............................");
        System.out.println("good bye");
    }
}
