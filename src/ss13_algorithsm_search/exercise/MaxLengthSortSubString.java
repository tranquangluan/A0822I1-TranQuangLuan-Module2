package ss13_algorithsm_search.exercise;

import java.util.LinkedList;
import java.util.Scanner;

public class MaxLengthSortSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> maxLengthSortSubString = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        System.out.print("Enter string : ");
        String string = sc.nextLine();

        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 1 && string.charAt(i)<=list.getLast()&&list.contains(string.charAt(i))){
                list.clear();
            }
            list.add(string.charAt(i));
            if (list.size()>maxLengthSortSubString.size()){
                maxLengthSortSubString.addAll(list);
            }
        }
        for (Character character: maxLengthSortSubString) {
            System.out.print(character);
        }
    }
}
