package com.bikram.arrays;

public class ArraysortHW {

    public static void main(String[] args) {
        int[] arr= {2,9,5,4,6,3,7,0};
        for(int i=0;i<arr.length-1;i++){
            int small=i;
            for(int j=i+1;j<arr.length;j++) {
                if (arr[small] > arr[j]) {
                    small = j;
                }

                int temp;
                temp = arr[small];
                arr[small] = arr[j];
                arr[j] = temp;
            }

            System.out.println("sorted array is :");
            for(int a:arr){
                System.out.print("\t"+a);
            }
            System.out.println();
        }
    }
}
