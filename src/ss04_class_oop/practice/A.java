package ss04_class_oop.practice;

import java.util.Arrays;

public class A {
    public static boolean isPalindrome (String str) {
        //Your code here
        String[] array = str.split("");
        String[] checkArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            checkArray[i] = array[i];
        }
        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            if (checkArray[i] == array[i]){
                continue;
            }else {
                break;
            }
        }
        String string1= new String(String.valueOf(array));
        String string2= new String(String.valueOf(checkArray));
        if (string1==string2) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {

        System.out.println(isPalindrome("abcba"));
    }
}
