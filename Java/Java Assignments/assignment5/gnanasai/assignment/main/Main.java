package com.core.java.assignment5.gnanasai.assignment.main;
import com.core.java.assignment5.gnanasai.assignment.data.Data;
import com.core.java.assignment5.gnanasai.assignment.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        data.print();
        /*
        data.anotherPrint();

        Not possible to call this method
         */

        Singleton secondClass = Singleton.method("hello");
        secondClass.print();

    }


}
