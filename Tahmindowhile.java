package normalprojects;

import java.util.Scanner;

public class Tahmindowhile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tahmin;
        int sayı = (int) (Math.random() * 100) + 1;
        do {
            System.out.println("Bir sayı giriniz : ");
            tahmin = scan.nextDouble();
            if (tahmin > 0 && tahmin < 101) {
                if (tahmin == sayı) {
                    System.out.println("Doğru bildin");
                } else if (tahmin > sayı) {
                    System.out.println("Daha küçük tahmin gir");
                } else {
                    System.out.println("Daha büyük tahmin gir");
                }
            } else {
                System.out.println("Belirtilen aralıkta tahmin gir");
            }
        } while (tahmin != sayı);

    }

}
