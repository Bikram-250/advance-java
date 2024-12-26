package com.bikram.arrays;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int [] arr={3,5,6,9,8,7,4,2,1};
        System.out.println("Unsorted Array:");
        System.out.println(Arrays.toString(arr));
        //sort array using Bubble sort algorithm
        int temp;
        for(int i=0;i<arr.length;i++){//i selects the pass of sorting
            for(int j=0;j<arr.length-i-1;j++){// j selects the element for sorting

                if(arr[j]>arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array is :");
        System.out.println(Arrays.toString(arr));
    }
}
