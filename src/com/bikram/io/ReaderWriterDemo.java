package com.bikram.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriterDemo {
    //For character oriented file io we can use FileReader and FileWriter
    //which encapsulation InputStreamReader and InputStreamWriter classes

    public static void main(String[] args) {

        FileReader fr=null;
        FileWriter fw=null;
        try{
            fr=new FileReader("C://Users//user//Desktop//test.txt");
            fw=new FileWriter("C://Users//user//Desktop//test_a.txt",true);

            //make appendable true

            int data;
            while((data=fr.read())!=-1){
                fw.write(data);

            }
            fw.write("\r\n");//creates new line for next execution of this program to write content in new line
        }catch(Exception e ) {
            System.out.println(e);

        }finally{
            try{
                if(fr!=null)
                    fr.close();
                if(fw!=null)
                    fw.close();
            }catch(IOException e){
                System.out.println(e);
            }
        }
    }
}
