package com.bikram.arrays;

import java.util.Scanner;

public class Array3DAdd {

    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of matrix a :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Enter the value of matrix b :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        //Sum of matrix a and matrix b i.e matrix c
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
            System.out.println();
        }

        System.out.println("Matrix a is ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t" + a[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matrix b is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t" + b[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The sum of matrix a and matrix b is");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t" + c[i][j]);
            }
            System.out.println();
        }
        /*System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + "\t" + b[i][j] + "\t\t\t " + c[i][j]+"\t");
            }
            System.out.println();*/


    }
}
