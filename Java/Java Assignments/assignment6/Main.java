package com.core.java.assignment6;

class Test{
    String text;
    public Test(String text){
        System.out.println(text);
        this.text=text;
    }

}


public class Main {
    public static void main(String[] args) {

        Test[] array = new Test[10];
        //No constructor messages are called

        for (int i=0;i<10;i++){
            array[i]=new Test("Object "+(i+1));
        }

    }
}
