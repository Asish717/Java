package com.bridgelabz;

import java.util.Scanner;

public class MyArrays {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int [] myarray;
//        myarray=new int[]{sc.nextInt()};
        int count=0;
        int sum=0;
        int [] myarray = {11,12,13,14,15,16,17,18,44,55,66,778,99};
        for (int even : myarray){
            if (even%2==0){
                sum =sum+even;
                count++;
                System.out.println(even);

            }
        }
//            for (int i=0;i<=myarray.length-1; i++);{
//                if (myarray[]%2==0){
//                    System.out.println(myarray);
//                }
//        }
        System.out.println("No of even numbers "+count);
        System.out.println("Sum of even numbers "+sum);
//        System.out.println("printing the array"+myarray);
    }
}
