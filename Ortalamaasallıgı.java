package smallprojects;

import java.util.Scanner;

public class Ortalamaasallıgı {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("10 tamsayı giriniz : ");
        double kaydedici = 0;
        int sayac = 0;
        for (int i = 0; i < 10; i++) {
            double sayı = scan.nextDouble();
            kaydedici = kaydedici + sayı;
        }
        double ortalama = kaydedici / 10;
        for (int i = 2; i < ortalama; i++) {
            if (ortalama % i == 0) {
                sayac = sayac + 1;
                break;
            }
        }
        System.out.println(ortalama);
        if (sayac > 0) {
            System.out.println("Asal Sana Uğramaz");
        } else {
            System.out.println("Tutturdun Asalı");
        }

    }

}
