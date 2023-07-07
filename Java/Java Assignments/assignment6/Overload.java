package com.core.java.assignment6;

class OverloadConstructor{
    int a;
    public OverloadConstructor(){
        this(100);
    }
    public OverloadConstructor(int a){
        this.a=a;
        System.out.println(a);
    }
}


public class Overload {
    public static void main(String[] args) {
        OverloadConstructor newClass = new OverloadConstructor();
    }

}
