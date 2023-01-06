package ss19_regex.exercise;

public class Validate_className {
    public static void main(String[] args) {
        String regexClass = "^[CAP]\\d{4}[GHIKLM]$";
        String className1 = "C0318G";
        String className2 = "M0318G";
        String className3 = "P0323A";

        System.out.println(className1.matches(regexClass));
        System.out.println(className2.matches(regexClass));
        System.out.println(className3.matches(regexClass));
    }
}
