package com.bikram.arrays;

public class MultiplicationMatrix {
    public static void main(String[] args) {
        //multiplication of two matrix

        int r1=2,c1=3;
        int r2=3,c2=2;
        int[][] first= {{2, 3, 4},{8,9,-7}};
        int[][] second={{3,-2},{8,9},{7,-6}};
        int[][] product=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    product[i][j] +=first[i][k]+second[k][j];
                }
            }
        }
        //displaying the product matrix
        System.out.println("the product of the matrix is :");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(product[i][j]+"\s");
            }
            System.out.println();
        }
        //display using enanced for loop
        // for(int e:product){
        //   for(int a:)
        // }
    }
}
