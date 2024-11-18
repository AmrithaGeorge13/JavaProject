package org.example;

public class A implements  Interface1,Interface2{
    @Override
    public void method1() {
        Interface1.super.method1();
    }
}
