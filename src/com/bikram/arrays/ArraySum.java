package com.bikram.arrays;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        //sum two 2 dimensional array and display the sum  array
        int[][] a, b, sum;
        a = new int[3][3];
        b = new int[3][3];
        sum = new int[3][3];
        //input matrix
        System.out.println("Enter elements of first matrix");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("a[" + i + "][" + j + "]");
                a[i][j] = sc.nextInt();
            }}
        System.out.println("Enter elements of second matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("a[" + i + "][" + j + "]");
                b[i][j] = sc.nextInt();
            }
        }
        //calculate sum matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = a[i][j];
            }
        }
        //display
        for(int i=0;i<3;i++){
            //display part of a
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+"\s");
            }
            for(int j=0;j<3;j++) {
                System.out.print(b[i][j] + "\t");
            }
            for(int j=0;j<3;j++) {
                System.out.print(sum[i][j] + "\s");
            }

            System.out.println();
        }
    }
}
