package com.core.java;


interface FunctionalInterface{
    public int start(int number);
}

interface AnotherFunctionalInterface{
    public String start(String text);
}
class Car{
    public void drive(FunctionalInterface obj){
        System.out.println("Driving the car");
        int value = obj.start(12);
        System.out.println(value);
    }

//    public void drive(AnotherFunctionalInterface obj){
//        System.out.println("Driving the car");
//        String value = obj.start("Hi there");
//        System.out.println(value);
//    }
}

public class Lambdas {
    public static void main(String[] args) {
        Car car = new Car();
//        car.drive(new FunctionalInterface() {
//            @Override
//            public void start() {
//                System.out.println("Start the car");
//            }
//        });
        car.drive(number -> {
            return 12 * number;
        });
    }
}
