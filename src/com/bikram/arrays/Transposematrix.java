package com.bikram.arrays;

public class Transposematrix {
    public static void main(String[] args) {
        int row = 2, colum = 3;
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] transpose = new int[colum][row];
        //transpose matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        //display transpose matrix
        for (int i = 0; i < colum; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("The transpose matrix using enhanced for loop is: ");
        display(transpose);
    }

    public static void display(int[][] matrix) {
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}

