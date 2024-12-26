package com.bikram.jdbc.mysql;

import java.util.Scanner;
import java.util.ArrayList;

public class EmployeeApp {
    //view +controller merged into one

    //view

    public void showEmployee(Employee emp){

        System.out.println("Employee [ Id: "+emp.getId()+",Name: "+emp.getName()+
                ",Email:"+emp.getEmail()+",Salary:"+emp.getSalary());
    }
    public void showmenu(){
        System.out.println("------------- Welcome to Employee Management System--------------");
        System.out.println("Our services:");
        System.out.println("1. Add new employee ");
        System.out.println("2. Display all employees ");
        System.out.println("3. Display employee by id ");
        System.out.println("4. Update Employee ");
        System.out.println("5. Delete Employee ");
        System.out.println(("6. Exit "));
        System.out.println(("Enter your choice :"));

    }

    public static  void main(String[] args) {
        EmployeeApp app= new EmployeeApp();
        Scanner sc= new Scanner(System.in);
        EmployeeDao employeeDao= new EmployeeDao();
        do {

            app.showmenu();
            int choice = sc.nextInt();

            switch (choice) {

                case 1 -> {//add employee
                    System.out.println("Adding new Employee");
                    //Collect data into an employee object and send it to dao

                    Employee emp=new Employee();
                    System.out.println("Enter employee name:");
                    sc.nextLine();//dummy scanner
                    emp.setName(sc.nextLine());

                    System.out.println("Enter employee email :");
                    emp.setEmail(sc.nextLine());
                    System.out.println("Enter employee salary");
                    emp.setSalary(sc.nextDouble());
                    if (employeeDao.save(emp)){
                        System.out.println("Employee record saved");
                    }else{
                        System.out.println("Employee record not saved ");
                    }


                }
                case 2 -> { //display employee
                    System.out.println("Displaying all employee");
                    ArrayList<Employee> employeeList= employeeDao.getall();
                    System.out.println("-----------------------------------");
                    for(Employee emp :employeeList){
                        app.showEmployee(emp);
                    }
                    System.out.println("------------------------------------");
                }

                case 3 -> { //display employee search by id
                    System.out.println("Display employee with given id");

                    System.out.println("Enter employee id");
                    int id =sc.nextInt();
                    Employee emp= employeeDao.getById(id);
                    System.out.println("---------------------------------------");
                    if (emp!=null)
                        app.showEmployee(emp);
                    else
                        System.out.println("No record of employee found for id: " + id);
                    System.out.println("___________________________________________");

                }
                case 4 -> {//update employee
                    System.out.println("Update employee");
                    System.out.println("Enter employee id");
                    int id = sc.nextInt();
                    Employee emp = employeeDao.getById(id);
                    System.out.println("---------------------------------------");
                    if (emp != null){
                        app.showEmployee(emp);//employee found and displayed now ask user if they want to update
                    System.out.println("Do you want to update this record ?(y/n)");
                    if(sc.next().charAt(0)=='y') {//user says es to update
                        //we donot update employee id ;
                        System.out.println("Enter name :");
                        sc.nextLine();
                        emp.setName(sc.nextLine());
                        System.out.println("Enter email :");
                        emp.setEmail(sc.nextLine());
                        System.out.println("Enter Salary :");
                        emp.setSalary(sc.nextDouble());

                        if (employeeDao.update(emp)) {
                            System.out.println("Employee record updated ");
                        } else {
                            System.out.println("Update record failed");
                        }
                    }
                    }
                    else
                        System.out.println("No record of employee found for id: " + id);
                    System.out.println("___________________________________________");


                }
                case 5 -> { //delete employee
                    System.out.println("Delete employee record with given id");

                    System.out.println("Enter employee id");
                    int id =sc.nextInt();
                    Employee emp= employeeDao.getById(id);
                    System.out.println("---------------------------------------");
                    if (emp!=null) {
                        app.showEmployee(emp);
                        //Record found and displayed ,now ask user if they wand to delete the record or not
                        System.out.println("Do you want to delete this record");
                        if (sc.next().charAt(0) == 'y' && employeeDao.delete(id)){
                            System.out.println("Employee record deleted");
                        }
                    }else
                        System.out.println("Employee record delete failed ");
                    System.out.println("___________________________________________");


                }
                case 6 -> { //Exit the system and terminate the programme
                    System.out.println("Good Bye");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Wrong option selected");
                }
            };
            System.out.println("Do you want to continue ?(y/n) ");
        }while(sc.next().charAt(0)=='y');

        System.out.println("ThankYou");
    }
}
