package com.bridgelabz.constructors;

public class Animal {
    static String colour;

    int NoOfLegs;

    static void walk(){
        System.out.println("Animals can walk");
    }
    final void eat(){
        System.out.println("Animal can eat");
    }
    public Animal(int NoOfLegs){
        this.NoOfLegs=NoOfLegs;
    }
    public Animal(){
    }
}
