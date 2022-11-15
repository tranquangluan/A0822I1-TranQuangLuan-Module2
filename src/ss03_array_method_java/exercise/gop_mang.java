package ss03_array_method_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class gop_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[10];
        int[] array3 = new int[15];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("array1[" + i + "]:");
            array1[i]= sc.nextInt();
        }
//        System.out.println("array1: "+Arrays.toString(array1));
        for (int i = 0; i < array2.length; i++) {
            System.out.println("array2[" + i + "]:");
            array2[i]= sc.nextInt();
        }
//        System.out.println("array2: "+Arrays.toString(array2));

        for (int i = 0; i < array3.length; i++) {
            if (i < array1.length){
                array3[i]=array1[i];
            }else {
                int temp = array3.length-array1.length;
                for (int j = 0; j < array2.length; j++) {
                    if (i-array1.length==j){
                        array3[i]=array2[j];
                    }
                }
            }
        }
        System.out.println("array1: "+Arrays.toString(array1));
        System.out.println("array2: "+Arrays.toString(array2));
        System.out.println("array3: "+Arrays.toString(array3));
    }
}


