package com.bikram.arrays;

import java.util.Scanner;

public class MultidimensionalArray {

    public static void main(String[] args) {


        int[][] marks = new int[5][5];
        //this creates a matrix like structure  to hold multidimentional
        //first index represents row. suppose in this case it returns to student no.
        //second case represents column. suppose in this case it refers to subject no

        for (int i = 0; i < marks.length; i++) {//mark.lengh returns no of row ie 5
            for (int j = 0; j < marks[i].length; j++) {//marks[1].lenghth returns no of cols at i7
                marks[i][j] = (int) (Math.random() * 100);
            }
        }
        //displaying multidimensiona array
        for(int [] mark:marks){
            for(int m:mark){
                System.out.print(m+"\t");
            }
            System.out.println();
        }
        //statically decleared Multidimensional Array
        int[][] data ={ {1,2,3,},{3,4,5,},{6,7,8,}};
        char[][]symbols;
        symbols=new char[][]{{'+','-','*','/'},{'?','.','/',}};

        //Dynamically declared multidimensional Array
        int n,m;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no of rows :");
        n=sc.nextInt();
        System.out.println("Enter the no of columns :");
        m=sc.nextInt();
        int [][]numbers =new int[n][m];
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                numbers[i][j]=sc.nextInt();

            }
        }
    }
}
