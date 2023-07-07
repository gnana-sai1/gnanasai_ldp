package com.core.java.assignment5.gnanasai.assignment.singleton;

public class Singleton {
    String variable;

    public static Singleton method(String text){
        Singleton singleton= new Singleton();
        singleton.variable=text;
        return singleton;
    }
    public void print(){
        System.out.println(variable);
    }

    public static void main(String[] args) {

    }

}
