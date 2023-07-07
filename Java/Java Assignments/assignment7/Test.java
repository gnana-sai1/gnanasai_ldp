package com.core.java.assignment7;


interface Interface1 {
    void method1a();
    void method1b();
}


interface Interface2 {
    void method2a();
    void method2b();
}


interface Interface3 {
    void method3a();
    void method3b();
}


interface CombinedInterface extends Interface1, Interface2, Interface3 {
    void newMethod();
}


class MyClass implements CombinedInterface {
    @Override
    public void method1a() {
        System.out.println("Method 1a implementation");
    }

    @Override
    public void method1b() {
        System.out.println("Method 1b implementation");
    }

    @Override
    public void method2a() {
        System.out.println("Method 2a implementation");
    }

    @Override
    public void method2b() {
        System.out.println("Method 2b implementation");
    }

    @Override
    public void method3a() {
        System.out.println("Method 3a implementation");
    }

    @Override
    public void method3b() {
        System.out.println("Method 3b implementation");
    }

    @Override
    public void newMethod() {
        System.out.println("New method implementation");
    }


    void methodWithInterface1(Interface1 obj) {
        obj.method1a();
        obj.method1b();
    }
    void methodWithInterface2(Interface2 obj) {
        obj.method2a();
        obj.method2b();
    }
    void methodWithInterface3(Interface3 obj) {
        obj.method3a();
        obj.method3b();
    }
    void methodWithCombinedInterface(CombinedInterface obj) {
        obj.method1a();
        obj.method2b();
        obj.method3a();
        obj.newMethod();
    }
}


public class Test {
    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        myObj.methodWithInterface1(myObj);
        myObj.methodWithInterface2(myObj);
        myObj.methodWithInterface3(myObj);
        myObj.methodWithCombinedInterface(myObj);
    }
}
