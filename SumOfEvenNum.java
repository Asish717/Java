package com.bridgelabz;

import java.util.Scanner;

public class SumOfEvenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start num");
        int num1 = sc.nextInt();
        System.out.println("Enter end num");
        int num2 = sc.nextInt();

        int sum=0;
        int count=0;
        for(int a=num1; a<=num2; a++){
            if (a%2 ==0 ){
                sum = sum + a;
                count++;

            }

        }
        System.out.println("Sum of "+num1+" and "+num2+" is "+ sum);
        System.out.println("Count of even numbers is "+ count);
    }
}
