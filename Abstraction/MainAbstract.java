package com.bridgelabz.Abstraction;

public class MainAbstract {
    public static void main(String[] args) {
        Bird bird=new Parrot();
        Parrot parrot= new Parrot();
        bird.eat();
        parrot.eat();
        bird.fly();
        parrot.fly();
        bird.legs();
    }
}
