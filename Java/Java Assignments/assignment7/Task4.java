package com.core.java.assignment7;

interface Cycle1 {
    void ride();
}


 class Unicycle1 implements Cycle1 {
    @Override
    public void ride() {
        System.out.println("Riding a Unicycle");
    }
}


 class Bicycle1 implements Cycle1 {
    @Override
    public void ride() {
        System.out.println("Riding a Bicycle");
    }
}


 class Tricycle1 implements Cycle1 {
    @Override
    public void ride() {
        System.out.println("Riding a Tricycle");
    }
}


 class CycleFactory {
    public static Cycle1 createUnicycle() {
        return new Unicycle1();
    }

    public static Cycle1 createBicycle() {
        return new Bicycle1();
    }

    public static Cycle1 createTricycle() {
        return new Tricycle1();
    }
}

public class Task4 {
    public static void main(String[] args) {

        Cycle1 unicycle = CycleFactory.createUnicycle();
        unicycle.ride();


        Cycle1 bicycle = CycleFactory.createBicycle();
        bicycle.ride();


        Cycle1 tricycle = CycleFactory.createTricycle();
        tricycle.ride();
    }
}


