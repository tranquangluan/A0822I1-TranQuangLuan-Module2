package ss04_class_oop.practice;

import java.util.Arrays;


import java.util.Scanner;

public class A {
    static void method(){ }

    static void method(int x){ }

    static void method(float x){ }

    static void method(int x, double y){ }

    public static void main(String[] args) {
        int a = 100;
        m(a);
        System.out.println(a);
    }

    static void m(int x) {
        x = 200;
    }
}