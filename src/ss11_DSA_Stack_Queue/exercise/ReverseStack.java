package ss11_DSA_Stack_Queue.exercise;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static int[] reverseIntegerNumber(int[] numbers) {
        Stack<Integer> numbersStack = new Stack<>();
        for (int n : numbers) {
            numbersStack.push(n);
        }
        for (int i = 0; i <= numbers.length-1; i++) {
            numbers[i] = numbersStack.pop();
        }
        return numbers;
    }
    public static String[] reverseString(String[] words) {
        Stack<String> wordsStack = new Stack<>();
        for (String n : words) {
            wordsStack.push(n);
        }
        for (int i = 0; i <= words.length-1; i++) {
            words[i] = wordsStack.pop();
        }
        return words;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String mNumber = sc.nextLine();
        String[] tempArray = mNumber.split("");
        int[] numbers = new int[tempArray.length];
        for (int i = 0; i <= tempArray.length-1; i++) {
            numbers[i] = Integer.parseInt(tempArray[i]);
        }
        numbers = reverseIntegerNumber(numbers);
        for (int n : numbers) {
            System.out.print(n);
        }
        System.out.println("Enter a string : ");
        String mWord = sc.nextLine();
        String[] words = mWord.split("");
        words = reverseString(words);
        for (String n : words) {
            System.out.print(n);
        }
    }
}