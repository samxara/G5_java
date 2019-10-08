package com.company;

import java.util.Scanner;

public class C {

    int a = 10;
    int b = 9;
    String s= "#";
    String h= "@";

    public void MethodFirst(){
        System.out.println(a+"\n"+b);
    }

    public void MethodTwo(){
        System.out.println(s+"\n"+h);
    }

    public void MethodThree(){
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a-b);
        System.out.println(a%b);
    }

    public void MethodFour(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a integer");
        a = scanner.nextInt();
    }

    public void MethodFive(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a integer");
        b = scanner.nextInt();
    }
}
