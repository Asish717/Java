package com.bridgelabz.poly;

public class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("Dog can eat");
    }
    @Override
    void walk(){
        System.out.println("Dog can walk");
    }

    void sound(String name){
        System.out.println("Dog make sound"+" "+name);
    }
}
