package com.bikram.arrays;

import java.util.Scanner;

public class TravellingSalesman {

        public static void main(String[] args) {
            //wap a program to read sales of salesman in 12 months and to print sales made by ea"ch saleman
            // also print their average/ total sales each salesman made during the period

            int n,m;
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the no. of salesman");
            n=sc.nextInt();//5
            System.out.println("enter the no of month");
            m=sc.nextInt();//12
            double [][] sales =new double[n][m];

            System.out.println("enter sales record: " );
            for(int i=0;i<n;i++){//outer loop selects rows \salesman
                for(int j=0;j<m;j++){//inner loop selects column or months
                    System.out.println("Sales["+i+"]["+j+"]");
                    sales[i][j]=sc.nextDouble();

                }
            }
            double sum;
            System.out.println("Displaying  sales record ");
            System.out.println("---------------------------------------------------------------");
            for(int i=0;i<n;i++){
                //average sales of each salesman
                sum=0;
                for(int j=0;j<m;j++){
                    sum+=sales[i][j];

                    System.out.printf("%-10.2f",sales[i][j]);
                }
                System.out.printf("%-3s=%-10.2f","Avg",sum/m);
                System.out.println();
            }
        }
    }

