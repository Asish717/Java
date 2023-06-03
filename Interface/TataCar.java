package com.bridgelabz.Interface;

public class TataCar implements Car,DemoInterface{
    @Override
    public void drive() {
        System.out.println("Its a 4 wheel drive");
    }

    @Override
    public void brake() {
        System.out.println("Has ABS");
    }

    @Override
    public void gearshift() {
        System.out.println("Automatic transmission");
    }
}
