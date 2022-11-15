package ss02_loop.exercise;

public class hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");

        for (int i = 5; i > 0; i--) {
            for (int j = 6-i; j > 0 ; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");

        for (int i = 5; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 5 - i; k >= 0; k--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
