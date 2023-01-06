package ss19_regex.exercise;

public class Validate_phoneNumber {
    public static void main(String[] args) {
        String regexClass = "^\\(\\d{2}\\)\\-\\(0\\d{9}\\)$";
        String className1 = "(84)-(0978489648)";
        String className2 = "(a8)-(22222222)";

        System.out.println(className1.matches(regexClass));
        System.out.println(className2.matches(regexClass));
    }
}
