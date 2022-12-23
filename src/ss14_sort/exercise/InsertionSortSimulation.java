package ss14_sort.exercise;

import java.util.Arrays;

public class InsertionSortSimulation {
    public static void insertionSort(int[] array) {
        int pos, flag;
        for(int i = 1; i < array.length; i++){
            System.out.println("Step "+i+":"+Arrays.toString(array));
            flag = array[i];
            pos = i;
            while(pos > 0 && flag < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;

            }
            array[pos] = flag;
            System.out.println("Step "+i+":"+Arrays.toString(array));
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

