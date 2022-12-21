package ss15_exception_debug.exercise;

import java.util.Scanner;

public class Triangle {
    private static int a;
    private static int b;
    private static int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    public static void checkEdgeOfTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a < 0 || b<0 || c<0) {
            throw  new IllegalTriangleException("Invalid Edge!!!");
        }else if (a+b <= c || b+c<=a || a+c<=b) {
            throw  new IllegalTriangleException("Invalid Edge!!!");
        }else {
            System.out.println("Valid!!!");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        do {
            flag=false;
            System.out.println("Enter 3 edges of triangle :");
            int firstEdge;
            int secondEdge;
            int thirdEdge;
            try {
                firstEdge = Integer.parseInt(scanner.nextLine());
                secondEdge = Integer.parseInt(scanner.nextLine());
                thirdEdge = Integer.parseInt(scanner.nextLine());
                checkEdgeOfTriangle(firstEdge,secondEdge,thirdEdge);
            } catch (IllegalTriangleException e){
                flag=true;
                e.printStackTrace();
                System.out.println("Invalid Edge!!!");
            } catch (NumberFormatException e){
                flag=true;
                e.printStackTrace();
                System.out.println("Entering string!!!");
            }
        }while (flag);
    }
}
