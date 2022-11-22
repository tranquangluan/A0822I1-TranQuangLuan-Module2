package ss04_class_oop.exercise;

import java.util.Scanner;

class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
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

public class Phuong_trinh_bac_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the coefficient of a:");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the coefficient of b:");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the coefficient of c:");
        double c = Double.parseDouble(sc.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
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
