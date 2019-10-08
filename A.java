package com.company;

public class A {

    int a=10;
    int b=29;

    public void MethodOne(){
        System.out.println("Hello OPP");
    }

    public void MethodTwo() {
        System.out.println(a);
    }

    public void MethodThree() {
        System.out.println(b);
    }

    public void MethodFour() {
        System.out.println(a + b);
    }

    public int MethodFive() {

        return a + b;
    }

    public int MethodSix() {
        return a * b;
    }

    public void MethodSeven() {
        a = 5;
        b = 6;
        System.out.println(a +" "+ b);
    }
}
