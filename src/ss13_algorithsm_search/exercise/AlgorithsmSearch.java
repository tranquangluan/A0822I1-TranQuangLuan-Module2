package ss13_algorithsm_search.exercise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class AlgorithsmSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> ascendingString = new LinkedList<>();
        System.out.println("Enter string : ");
        String string = sc.nextLine();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> tempList = new LinkedList<>();
            tempList.add(string.charAt(i));
            for (int j = i+1; j < string.length(); j++) {
                if (string.charAt(j) > tempList.getLast()){
                    tempList.add(string.charAt(j));
                }
            }
            if (tempList.size()>ascendingString.size()){
                ascendingString.addAll(tempList);
            }
        }
        for (Character character: ascendingString) {
            System.out.print(character);
        }
    }
}
