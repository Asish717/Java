package com.bridgelabz;

public class TwoDArray {
    public static void main(String[] args) {
        int [][] array = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i=0; i<= array.length-1;i++){
            for (int j=0; j< array.length;j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
