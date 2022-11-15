package ss03_array_method_java.exercise;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class xoa_phan_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {10,4,6,7,8,6,0,0,0,0};
        System.out.println("Enter the value need to delete :");
        int n = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i]==n){
                System.out.println("Has the value "+n+" in the array");
                for (int j = i; j < array.length-1; j++) {
                    array[j]=array[j+1];
                }
            }
        }
        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array1.length; i++) {
//            System.out.println(array1[i]);
//        }
    }
}
