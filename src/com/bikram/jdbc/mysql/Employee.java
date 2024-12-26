package com.bikram.jdbc.mysql;

import java.io.Serial;
import java.io.Serializable;
//java Bean : DataHiding ,Serializable ,public Constructors and public getter and setters

public class Employee implements Serializable {
    @Serial
    private static final long serialVersionUID =434723L;

    private int id;
    private String name;
    private String email;
    private double salary;

    //public constructors

    public Employee() {
    }

    public Employee(int id, String name, String email, double salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    //public getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
