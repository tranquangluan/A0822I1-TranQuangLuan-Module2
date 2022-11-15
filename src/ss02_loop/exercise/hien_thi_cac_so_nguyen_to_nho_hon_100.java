package ss02_loop.exercise;

import java.util.Scanner;

public class hien_thi_cac_so_nguyen_to_nho_hon_100 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int n = 100;
        for (int i = 2; i < n; i++) {
            int temp = 1;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    temp = 0;
                }
            }
            if (temp == 1) {
                System.out.println(i + " ");
            }
        }
    }
}
