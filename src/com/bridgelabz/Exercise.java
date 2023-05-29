package com.bridgelabz;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st num");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd num");
        int num2 = sc.nextInt();


        if (num1 <= num2) {
            System.out.println("Is less then to "+ num2);
        } else {
            System.out.println("Is not less then to "+ num2);

        }

        if (num1 >= num2) {
            System.out.println("Is greater then to "+ num2);
        } else {
            System.out.println("Is not greater then to "+ num2);

        }
    }

}