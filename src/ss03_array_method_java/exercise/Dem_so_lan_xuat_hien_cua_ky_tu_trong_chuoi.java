package ss03_array_method_java.exercise;

import java.util.Scanner;

public class Dem_so_lan_xuat_hien_cua_ky_tu_trong_chuoi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sentence = "I am the most handsome man in the world!!!";
        String[] toArray = sentence.split("");
        int count = 0;
        System.out.println("Enter the word you want to count : ");
        String word = scanner.nextLine();
        for (int i = 0; i < toArray.length; ++i) {
            if (toArray[i].equals(word)) {
                count++;
            }
        }
        System.out.println(sentence);
        System.out.println("The times of " + word + " is : " + count);
    }

}
