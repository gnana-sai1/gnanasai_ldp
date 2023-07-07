package com.core.java.assignment7;
import com.core.java.assignment7.Class1;

public class Class2 {
    public class InnerClass2 extends Class1.InnerClass1 {

        public InnerClass2(Class1 obj) {
            obj.super(100);

        }
    }
}
