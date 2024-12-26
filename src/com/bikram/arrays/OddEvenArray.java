package com.bikram.arrays;

public class OddEvenArray {
    public static void main(String[] args) {


        int[] nums = {17, 3, 8, 12, 21, 35, 11, 28, 4, 16};
        int even = 0, odd = 0;
        for (int e : nums) {
            if (e % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        int[] evenNums = new int[even];
        int[] oddNums = new int[odd];
        int even1=0 ,odd1=0;
        for(int e: nums){
            if( e%2==0){
                evenNums[even1++]=e;
            }else{
                oddNums[odd1 ++]=e;
            }
        }
        System.out.print("Odd numbers\t");
        for(int e:oddNums){
            System.out.println(e);
        }
        System.out.print("even numbers\t");
        for(int e:evenNums){
            System.out.println(e);
        }

    }
}
