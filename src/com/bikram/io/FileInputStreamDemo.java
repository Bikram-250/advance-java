package com.bikram.io;


import java.io.*;

public class FileInputStreamDemo {
    //copy contents of one file into another using stream based io
    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fos=null;

        try {
            String src = "C://Users//user//Desktop//test.txt";
            fis = new FileInputStream(src);

            File dest = new File("C://Users//user//Desktop//test_a.txt");
            fos = new FileOutputStream(dest);

            int i;
            while ((i = fis.read()) != -1) {//read until we reach end of file
                System.out.print((char)i);
                fos.write(i);
            }

        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }finally{
            try {
                if (fis != null)
                    fis.close();
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                System.out.println(e);
            }


        }
    }

}
