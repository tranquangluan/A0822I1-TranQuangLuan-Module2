package ss01_introduction_java.exercise;

import java.util.Scanner;

public class Chuyen_doi_tien_te {
    public static void main(String[] args){
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mount in usd: ");
        usd = sc.nextDouble();
        double quyDoi= usd* 23000;
        System.out.println("VND value: "+ quyDoi);
    }
}
