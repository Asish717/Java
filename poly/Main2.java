package com.bridgelabz.poly;

public class Main2 {
    public static void main(String[] args) {
        Account account=new Account(1234,"Asish","Savings");

        Employee employee=new Employee(77,"Chotu","Engineer",account);

        employee.displayDetails();
    }
}
