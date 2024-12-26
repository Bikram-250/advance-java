package com.bikram.arrays;

import java.util.Scanner;

public class DynamicArray {

    //Dynamic array declaration in when we declare an array and give its size at runtime
    public static void main(String[] args) {
        //a program to input marks of n students and display if the student passed or failed
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of students : ");
        n=sc.nextInt();

        int[] marks =new int[n];
        //input marks
        for(int i=0;i<n;i++) {
            System.out.println("marks of students" + (i + 1));
            marks[i] = sc.nextInt();
        }
        //display marks with remarks
        int count=1;
        for(int m :marks){
            System.out.println("Student"+ (count++)+"\tResult:"+(m>=40?"pass":"fail"));
        }
    }
}
