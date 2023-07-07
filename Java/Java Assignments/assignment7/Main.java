package com.core.java.assignment7;
import com.core.java.assignment7.Class2;

public class Main {
    public static void main(String[] args) {
        Class1 class1 = new Class1();

        Class2.InnerClass2 innerClass2 = new Class2().new InnerClass2(class1);
        System.out.println(innerClass2.getNumber());
    }

}
