package com.bridgelabz.encapsulation;

public class MainEncap {
    public static void main(String[] args) {
        BankAccount acc=new BankAccount();
        acc.setAccNo(1234567890);
        acc.setName("Asish");
        System.out.println(acc.getAccNo());
        System.out.println(acc.getName());
    }
}
