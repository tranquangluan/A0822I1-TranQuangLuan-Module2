package ss03_array_method_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class them_phan_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        int[] array2 = new int[array1.length+1];
        for (int i = 0; i < array1.length; i++) {
            array2[i]=array1[i];
        }
        System.out.println("Enter the value need to insert :");
        int n = sc.nextInt();
        System.out.println("Enter the index need to insert :");
        int index = sc.nextInt();
        if (index < 0 && index >= (array1.length - 1)) {
            System.out.println("Unable to insert into array");
        } else {
            for (int i = 0; i < array1.length; i++) {
                if (i == index) {
                    for (int j = array2.length-1 ; j > i ; j--) {
                        array2[j] = array1[j-1];
                    }
                    array2[index] = n;
                }
            }
            System.out.println(Arrays.toString(array2));
        }
    }
}
