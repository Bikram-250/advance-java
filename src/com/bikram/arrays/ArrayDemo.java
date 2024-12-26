package com.bikram.arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        //Declaring Arrayb
        byte[] data;
        //array creation and initialization
        data= new byte[5];
        //Array has been initialized with default value during its creation ,so we can access
        //just after creation
        System.out.println("Default element :"+data[3]);
        data[0]=12;
        data[1]=32;
        data[3]=(byte)(data[0]+data[1]);
        //result a arithmetic operation is an integer value which is converted back into byte by type casting
        //we use loop to access all array elements
        for(int i = 0; i<5; i++){
            System.out.println("data["+i+"]="+data[i]);
        }
        //enhanced for loop to acess array element
        for(byte b:data) {  //for each byte b in data(array of bytes)
            System.out.println(b);

        }
    }
}
