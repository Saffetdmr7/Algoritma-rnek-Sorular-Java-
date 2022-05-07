package normalprojects;

import java.util.Scanner;

public class Tahminwhile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pc = (int) (Math.random() * 100) + 1;
        System.out.println("Tahmin oyununa hoşgeldiniz");
        System.out.println("her yanlış tahminde\nbaşta verilen 500 puanınız 5 er 5 er azalır");
        System.out.println(pc);
        double tahmin = 0;
        int sayac = 500;
        while (tahmin != pc) {
            System.out.println("1-100 arasında bir sayı giriniz : ");
            tahmin = scan.nextDouble();
            sayac -= 5;
            if (tahmin > 1 && tahmin < 100) {

                if (tahmin == pc) {
                    System.out.println("tebrikler doğru tahmin ettiniz puanınız = " + sayac);
                } else if (tahmin > pc) {
                    System.out.println("Daha küçük bir sayı tahmin ediniz : ");
                } else {
                    System.out.print("Daha büyük bir sayı tahmin ediniz : ");
                }
            } else {
                System.out.println("Lütfen belirtilen aralıktan bir sayı giriniz : ");
            }
        }
    }
}
