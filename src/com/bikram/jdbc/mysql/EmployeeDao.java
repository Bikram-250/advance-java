package com.bikram.jdbc.mysql;

import java.sql.*;
import java.util.ArrayList;

public class EmployeeDao {

    public static final String DB_URL="jdbc:mysql://localhost:3306/test_mysql_db";
    public static final String USER="root";
    public static final String PASS="admin@123#";
    public static final String DRIVER_CLASS="com.mysql.cj.jdbc.Driver";


    //create operation
    public boolean save(Employee employee){
        boolean success=false;
        Connection conn=null;
        PreparedStatement ps=null;
        String sql="insert into employee_table(name, email, salary) values(?,?,?)";
                try{
                    Class.forName(DRIVER_CLASS);
                    conn= DriverManager.getConnection(DB_URL,USER,PASS);
                    ps=conn.prepareStatement(sql);
                    ps.setString(1, employee.getName());
                    ps.setString(2, employee.getEmail());
                    ps.setDouble(3, employee.getSalary());
                    if (ps.executeUpdate()==1){
                        success=true;
                    }
                }catch(Exception e){
                    System.out.println("Exception occured : "+e.getMessage());
                }finally  {
                    try{
                        if (conn!=null)
                            conn.close();
                    }catch(SQLException e){
                        System.out.println("Exception :"+e.getMessage());
                    }
                }

        return success;
    }

    //retrive employee records l

    public ArrayList<Employee> getall(){
        ArrayList<Employee> employees =new ArrayList<>();
        Connection conn =null;
        PreparedStatement ps = null;
        String sql="select * from employee_table ";
        try {
            Class.forName(DRIVER_CLASS);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            //ResultSet is a data-structure  that hold database records as a result of select query
            while (rs.next()) {//rs.next()returns true if there is a record and moves the cursor to that record
                //create an employee objects with the content of that record
                Employee e = new Employee();
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                e.setEmail((rs.getString("email")));
                e.setSalary(rs.getDouble("salary"));
                //add the employee objects to a collection (arraylist)
                employees.add(e);
            }
            }catch(Exception ex){
                System.out.println("Exception :" + ex.getMessage());
            }finally{
                try {
                    if (conn != null)
                        conn.close();
                } catch (SQLException ex){
                System.out.println("Exception :" + ex.getMessage());
            }
        }


        return employees;
    }

    //get employee record by id field
    public Employee getById(int id){
        Employee emp= null;
        Connection conn= null;
        PreparedStatement ps= null;
        String sql= "select * from employee_table where id=?";
        try{
            Class.forName(DRIVER_CLASS);
            conn= DriverManager.getConnection(DB_URL,USER,PASS);
            ps = conn.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
                emp=new Employee(rs.getInt("id"),rs.getString("name"),
                        rs.getString("email"),rs.getDouble("salary") );
            }
        }catch (Exception e ){
            System.out.println("Exception :"+e.getMessage());
        }finally{
            try{
                if (conn!=null)
                    conn.close();
            }catch(SQLException e){
                System.out.println("Exception :"+e.getMessage());
            }
        }


        return emp;
    }

    //update record
    public boolean update(Employee employee){
        boolean status =false;
        Connection conn=null;
        PreparedStatement ps = null;
        String sql="update employee_table set name=?,email=?,salary=? where id=?";
        try{
            Class.forName(DRIVER_CLASS);
            conn=DriverManager.getConnection(DB_URL,USER,PASS);
            ps=conn.prepareStatement(sql);
            ps.setString(1,employee.getName());
            ps.setString(2,employee.getEmail());
            ps.setDouble(3,employee.getSalary());
            ps.setInt(4,employee.getId());

            if(ps.executeUpdate()==1){
                status=true;
            }

        }catch (Exception e){
            System.out.println("Exceptiion :"+e.getMessage());
        }finally{
            try{
                if(ps!=null)
                    ps.close();
            }catch(SQLException e){
                System.out.println("Exception :"+e.getMessage());
            }
        }

        return status;
    }

    //delete record
    public boolean delete (int id ){
        boolean status =false;
        Connection conn=null;
        PreparedStatement ps = null;
        String sql="delete from employee_table where id=?";
        try{
            Class.forName(DRIVER_CLASS);
            conn=DriverManager.getConnection(DB_URL,USER,PASS);
            ps=conn.prepareStatement(sql);

            ps.setInt(1,id);

            if(ps.executeUpdate()==1){
                status=true;
            }

        }catch (Exception e){
            System.out.println("Exceptiion :"+e.getMessage());
        }finally{
            try{
                if(ps!=null)
                    ps.close();
            }catch(SQLException e){
                System.out.println("Exception :"+e.getMessage());
            }
        }

        return status;
    }

}
