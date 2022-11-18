package ss04_class_oop.exercise;

import java.util.Scanner;

class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadraticEquation() {

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    double getDiscriminant() {
        double delta = Math.pow(b, 2) - 4 * a * c;
        return delta;
    }

    double getRoot1() {
        double x1 = (-b + Math.sqrt(getDiscriminant())) / (2 * a);
        return x1;
    }

    double getRoot2() {
        double x2 = (-b - Math.sqrt(getDiscriminant())) / (2 * a);
        return x2;
    }

}

public class phuong_trinh_bac_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        QuadraticEquation quadraticEquation = new QuadraticEquation();

        System.out.println("Enter the coefficient of a:");
        double a = Double.parseDouble(sc.nextLine());
        quadraticEquation.setA(a);
        System.out.println("Enter the coefficient of b:");
        double b = Double.parseDouble(sc.nextLine());
        quadraticEquation.setB(b);
        System.out.println("Enter the coefficient of c:");
        double c = Double.parseDouble(sc.nextLine());
        quadraticEquation.setC(c);

        double delta = quadraticEquation.getDiscriminant();

        if (delta>=0){
            System.out.println("The equation has 2 solutions");
            System.out.println("x1 = "+quadraticEquation.getRoot1());
            System.out.println("x2 = "+quadraticEquation.getRoot2());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
