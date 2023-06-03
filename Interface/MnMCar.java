package com.bridgelabz.Interface;

public class MnMCar implements Car,DemoInterface{

    @Override
    public void drive() {
        System.out.println("Its a 4 wheel drive");
    }

    @Override
    public void brake() {
        System.out.println("Has no ABS");
    }

    @Override
    public void gearshift() {
        System.out.println("Manual transmission");
    }
}
