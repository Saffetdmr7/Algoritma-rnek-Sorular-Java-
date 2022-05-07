package smallprojects; //@ author Saffet Demir
import java.util.Scanner;
public class Mukemmelsayı {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        double sayı = scan.nextDouble();
        int sayac = 0;
        for (int i = 1; i < sayı; i++) {
            if (sayı % i == 0) {
                sayac += i;
            }
        }
        if (sayac == sayı) {
            System.out.println(sayı + " Mükemmel bir sayıdır.");
        } else {
            System.out.println(sayı + " Mükemmel bir sayı değildir");
        }
    }
}
