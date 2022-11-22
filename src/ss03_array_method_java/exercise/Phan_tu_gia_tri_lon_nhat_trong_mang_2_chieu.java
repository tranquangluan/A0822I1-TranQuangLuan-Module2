package ss03_array_method_java.exercise;

import java.util.Scanner;

public class Phan_tu_gia_tri_lon_nhat_trong_mang_2_chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("array["+i+"]["+j+"]:");
                array[i][j]=sc.nextInt();
            }
        }
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max<=array[i][j]){
                    max = array[i][j];
                }
            }
        }
        System.out.println("The maximum value in the array is :"+max);
    }
}
