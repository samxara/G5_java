package com.company;

import java.util.Scanner;

public class B {

    int a=33;
    double b=9.7;
    String s="#";

    public void MethodOne(){
        System.out.println(s);
    }

    public void MethodTwo(){
        System.out.println(a);
    }

    public void MethodThree(){
        System.out.println(b);
    }

    public void MethodFour(){
        System.out.println(a-b);
    }

    public void MethodFive(){
        System.out.println(a / b);
    }

    public void MethodSix(int i,double d,String S){
        a = i;
        b = d;
        s = S;
    }

    public void MethodSeven(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer");
        a = keyboard.nextInt();
    }

    public void MethodEight(){
        System.out.println(b+10);
    }

}
