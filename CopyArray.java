package com.bridgelabz;

import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter an array");
//        int [] arr1= new int[]{sc.nextInt()};
        int []arr1={1,2,3,4,5,6,7};
        int []arr2 =new int[arr1.length];

        for (int i=0; i< arr1.length;i++){
            arr2[i]= arr1[i];
            System.out.print(arr2[i]);

        }

    }
}