package com.bikram.jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertOperation {

    public static final String DB_URL="jdbc:mysql://localhost:3306/test_mysql_db";
    public static final String USER="root";
    public static final String PASS="admin@123#";
    public static final String DRIVER_CLASS="com.mysql.cj.jdbc.Driver";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String name,email;
        double salary;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of employee");
        name=sc.nextLine();
        System.out.println("enter the email: ");
        email=sc.nextLine();
        System.out.println("enter emplooyee saalry: ");
        salary=sc.nextDouble();
        //step 1: load Database Driver Class
        Class.forName(DRIVER_CLASS);

        //step 2: create connection object
        Connection conn= DriverManager.getConnection(DB_URL,USER,PASS);

        //step 3: Create statement object which can execute sql query...
        Statement st=conn.createStatement();//create empty statement

        //step 4 write sql query and execute it using statement
        String sql= "insert into employee_table ( name, email , salary) values ( '"+name+"','"+email+"',"+salary+")";

        int i=st.executeUpdate(sql);
        /**
         * execute -->creating table
         * executeUpdate-->insert,update, operation --->int (no of rows affected)
         * executeQuery-->select -->select-->ResultSet(Temporary view of database table)
         *
         */

        //step 5:User result from database operation
        if(i==1){
            System.out.println("One record inserted");
        }

        //step 6 closing resources
        if(st!=null)
            st.close();
        if(conn!=null)
            conn.close();
    }
}
