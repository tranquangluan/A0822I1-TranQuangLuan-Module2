package ss14_sort.exercise;

import java.util.Arrays;

public class InsertionSortSimulation {
    public static void insertionSort(int[] array) {
        int pos, x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
//            System.out.println("Step "+i+":"+Arrays.toString(array));
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
                System.out.println("Step "+i+":"+Arrays.toString(array));
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        int[] numberArray = {5, 2, 17, 35, 23, 21};
        System.out.print("Initial array :");
        System.out.println(Arrays.toString(numberArray));
        insertionSort(numberArray);
        System.out.print("After sort :" + Arrays.toString(numberArray));
    }
}
