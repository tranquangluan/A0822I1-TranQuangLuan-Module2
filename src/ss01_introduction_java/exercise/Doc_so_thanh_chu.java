package ss01_introduction_java.exercise;

import java.util.Scanner;

public class Doc_so_thanh_chu {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number need to read : ");
            int readNumber = scanner.nextInt();
            if (readNumber >= 0 && readNumber <= 10) {
                System.out.println(oneDigitToLetter(readNumber));
            } else if (readNumber < 100) {
                System.out.println(twoDigitToLetter(readNumber));
            } else {
                System.out.println(threeDigitToLetter(readNumber));
            }
        }
    }

    private static String oneDigitToLetter(int number) {
        switch (number) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 10:
                return "ten";
        }
        return "zero";
    }

    private static String twoDigitToLetter(int number) {
        String result = "";
        if (number < 20) {
            switch (number) {
                case 11:
                    return "eleven";
                case 12:
                    return "twelve";
                case 13:
                    return "thirteen";
                case 14:
                    return "fourteen";
                case 15:
                    return "fifteen";
                case 16:
                    return "sixteen";
                case 17:
                    return "seventeen";
                case 18:
                    return "eighteen";
                case 19:
                    return "nineteen";
            }
        } else {
            int tens = number / 10;
            int ones = number % 10;

            switch (tens) {
                case 2:
                    result = "twenty ";
                    break;
                case 3:
                    result = "thirty ";
                    break;
                case 4:
                    result = "forty ";
                    break;
                case 5:
                    result = "fifty ";
                    break;
                case 6:
                    result = "sixty ";
                    break;
                case 7:
                    result = "seventy ";
                    break;
                case 8:
                    result = "eighty ";
                    break;
                case 9:
                    result = "ninety ";
                    break;
            }

            if (ones != 0) {
                result += oneDigitToLetter(ones);
            }
        }

        return result;
    }

    private static String threeDigitToLetter(int number) {
        String result = "";
        int hundreds = number / 100;
        int others = number - (hundreds * 100);
        switch (hundreds) {
            case 1:
                result = "one hundred and ";
                break;
            case 2:
                result = "two hundred and ";
                break;
            case 3:
                result = "three hundred and ";
                break;
            case 4:
                result = "four hundred and ";
                break;
            case 5:
                result = "five hundred and ";
                break;
            case 6:
                result = "six hundred and ";
                break;
            case 7:
                result = "seven hundred and ";
                break;
            case 8:
                result = "eight hundred and ";
                break;
            case 9:
                result = "nine hundred and ";
                break;
        }

        if (others != 0 && others <9) {
            result += oneDigitToLetter(others);
        } else if (others>=10){
            result += twoDigitToLetter(others);
        }
        else {
            return "one hundred";
        }
        return result;
    }
}

