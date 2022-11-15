package ss03_array_method_java.exercise;

import java.util.Scanner;

public class gia_tri_nho_nhat_trong_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "]:");
            array[i] = sc.nextInt();
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min >= array[i]) {
                min = array[i];
            }
        }
        System.out.println("The minimum value in the array is :" + min);
    }

}


