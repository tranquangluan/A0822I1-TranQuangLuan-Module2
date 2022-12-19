package ss13_algorithsm_search.exercise;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class BinarySearchUseRecursive {
    public static int binarySearch(int[] array, int left, int right, int value) {
        while (left <= right) {
            int middle = (left + right) / 2;
            if (value == array[middle]) {
                return middle;
            } else if (value > array[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array :");
        int n = Integer.parseInt(sc.nextLine());
        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("arr[" + i + "]= ");
            array[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.print("Initial array :");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j]<array[i]){
                    int temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }

        System.out.print("After sort :");
        System.out.println(Arrays.toString(array));

        System.out.print("Search value :");
        int value = Integer.parseInt(sc.nextLine());

        System.out.println(binarySearch(array, 0, array.length - 1, value));

//        System.out.println(arrayList);
    }

}
