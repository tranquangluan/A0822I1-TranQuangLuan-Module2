package ss10_DSA_List.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    int [] a;
    public static int [] sortArrayDescending(int [] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]>arr[i]){
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return arr;
    }
    public static int[] sortArrayAscending(int [] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return arr;
    }

}
