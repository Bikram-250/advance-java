package com.bikram.io;
//
///*
//public class FileDemo {
//    /*
//   File is a class in java.io package which is used to represent a file or directory in our file system.
//   Create,Access its properties and delete them.
//
//    */
//    public static void main(String[] args) throws IOException {
//        File file =new File("C://Users//Lenovo//Desktop//test.txt");
//        //file object is a logical representation that may or may not exist
//
//        if (file.exists()){
//            System.out.println("File or Directory exists");
//        }
//        if(file.isFile()){
//            System.out.println("This is a file in our file-system");
//        }
//
//        //if file exists then its properties or else create new file
//
//        if(!file.exists()) {
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                System.out.println("Exception :" + e);
//            }
//            System.out.println("New File Created");
//        }else{
//            System.out.println("File Name: "+file.getName());
//            System.out.println("Parent Directory : "+file.getParent());
//            System.out.println("Size :"+file.length()+"  Bytes");
//            System.out.println("Readable : "+file.canRead());
//            System.out.println("Writeable : "+file.canWrite());
//            System.out.println("Free Disk Space"+file.getFreeSpace());
//            System.out.println("Total Disk Space :"+file.toURI());
//        }
//
//        //to represent a folder
//        File dir=new File("C://Users//user//Desktop//java_class");
//        if(!dir.exists()){
//            dir.mkdir();//create java folders in desktop
//            dir.mkdirs();//create java and all its non-existing folders
//            System.out.println("New directory created ");
//        }else{
//            //access directory properties like as in file
//            //additionally we can access files within that directory
//
//            System.out.println("Content of directory :"+dir.getName());
//            String[] files =dir.list();
//            for(String s:files){
//                System.out.print(s+"\t");
//                System.out.println(new File(dir.getPath()+File.separator+s).length()+"Bytes");
//            }
//        }
//
//    }
//
