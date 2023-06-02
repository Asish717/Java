package com.bridgelabz;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month");
        int m= sc.nextInt();
        System.out.println("Enter day");
        int d= sc.nextInt();

        if (m==3 && d==20){
            System.out.println("Its Spring season");
        }else {
            System.out.println("Its not spring season");
        }
    }
}
