package normalprojects;
//Saffetdmr7
import java.util.Scanner;

public class Yıldızucgen {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int sayı = scan.nextInt();
        int yıldız = 1, bosluk = sayı;
        if (sayı % 2 == 1) {
            for (int i = 0; i < sayı; i++) {
                for (int j = 0; j < bosluk; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < yıldız; k++) {
                    System.out.print("*");
                }
                bosluk -= 1;
                yıldız += 2;
                System.out.println();
            }
        } else {
            for (int i = 0; i < sayı; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < sayı; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

}
