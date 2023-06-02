package com.bridgelabz;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
//        int num=11;
        int prime=0;
        for (int i=2;i<num/2;i++){
            if (num%i==0){
                prime++;
                break;
            }
        }
        if (prime==0){
            System.out.println("Number is prime");
        }else {
            System.out.println("Not prime");
        }
    }
}
