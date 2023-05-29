package com.bridgelabz;

public class Loop {
    public static void main(String[] args) {
        for (int a=0 ; a<=10 ; a++){
            if (a%2 == 0){
                System.out.println(a);
            }
        }

        int num=1;
        while (num<=10){
            System.out.println(num);
            num++;
        }
        System.out.println("\n");
        int i=1;
        do {
            System.out.println(i);
            i++;
        }while (i <=10);
    }
}
