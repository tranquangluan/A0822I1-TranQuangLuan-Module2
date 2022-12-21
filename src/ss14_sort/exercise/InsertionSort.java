package ss14_sort.exercise;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        int pos, x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;
        }
    }
    public static void main(String[] args) {
        int[] numberArray = {9, 5, 7, 3, 8, 1};
        System.out.print("Initial array :");
        System.out.println(Arrays.toString(numberArray));
        System.out.print("After sort :");
        insertionSort(numberArray);
        System.out.print(Arrays.toString(numberArray));
    }
}
