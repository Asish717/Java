package com.bridgelabz;

public class MyMethod {
    static void myGreet(){
        System.out.println("Hello world");
    }
    public static int sumOfTwoNum(int a,int b){
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
        myGreet();
        sumOfTwoNum(20,77);
    }
}
