/*package com.bikram.arrays;

public class ArrayMinMax {

    //input 10 elements store in  an array and find the min and max of all elements
    public static void main(String[] args) {


        int[] num = new int[10];
        int sum = 0, min, max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 e ements");
        for(int i=0;i<10;i++){//num.length gives size(no of elements )in an array
            num[i]=sc.nextInt();
        }
        sum=num[0];
        min=num[0];
        max=num[0];
        for(int i=0;i<num.length;i++) {
            //find sum
            sum += num[i];
            //find min
            if (min > num[i])
                min = num[i];
            //find max
            if (max < num[i])
                max = num[i];
        }
        System.out.println("the ");

    }
}*/

