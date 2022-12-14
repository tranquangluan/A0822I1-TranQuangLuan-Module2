package ss11_DSA_Stack_Queue.exercise;

import java.util.*;

public class UseMapToCountWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Integer> countingMap = new TreeMap<>();
        String input = sc.nextLine();
        String[] words = input.split("");
        for (int i = 0; i < words.length; ++i) {
            words[i] = words[i].toLowerCase();
        }
        System.out.println("Given string : ");
        for (String n : words) {
            System.out.print(n);
        }
        countingMap.put(words[0], 1);
        for (int i = 1; i < words.length; ++i) {
            for (Map.Entry<String, Integer> entry : countingMap.entrySet()) {
                if (countingMap.containsKey(words[i])) {
                    entry.setValue(entry.getValue() + 1);
                } else {
                    countingMap.put(words[i], 1);
                }
            }
        }
        System.out.println("This is map : ");
        for (Map.Entry<String, Integer> entry : countingMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + countingMap.get(entry.getKey()));
        }
    }
}