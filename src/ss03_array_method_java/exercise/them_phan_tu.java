package ss03_array_method_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class them_phan_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        System.out.println("Enter the value need to insert :");
        int n = sc.nextInt();
        System.out.println("Enter the index need to insert :");
        int index = sc.nextInt();
        if (index < 0 && index >= (array.length - 1)) {
            System.out.println("Unable to insert into array");
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                if (i == index) {
                    for (int j = array.length - 1; j > i ; j--) {
                        array[j] = array[j-1];
                    }
                    array[index] = n;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
