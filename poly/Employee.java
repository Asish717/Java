package com.bridgelabz.poly;

public class Employee {
    Integer empId;
    String empName;
    String empDesignation;

    Account account;   //HAS-A-Relation

    public Employee(Integer empId, String empName, String empDesignation, Account account) {
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.account = account;
    }
    public void displayDetails(){
        System.out.println();
        System.out.println("Employee Details");
        System.out.println("Emp Id :: "+empId);
        System.out.println("EmpName :: "+empName);
        System.out.println("Emp Designation :: "+empDesignation);
        System.out.println();
        System.out.println("Account Details");
        System.out.println("Account number :: "+account.getAccNo());
        System.out.println("Account name :: "+account.name);
        System.out.println("Account type :: "+account.getAccType());

    }
}
