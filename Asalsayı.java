package smallprojects;            //@ author Saffet Demir

import java.util.Scanner;

public class Asalsayı {// Asal sayı bulma programı

    public static void main(String[] args) {// Ana metot

        Scanner scan = new Scanner(System.in);// Klavye girişi

        System.out.print("Pozitif bir tamsayi giriniz: ");// Veri girişi
        long sayı = scan.nextLong();// Verinin tanımlanması
        int sayac = 0;

        for (int i = 2; i < sayı; i++) {// sayının kendinden küçük  
            if (sayı % i == 0) {           // her sayıya bölünmesini sağlayan döngü
                sayac++;
                break; // sayacın 0 ı geçmesi durumunda döngüden çıkar
            }
        }
        if (sayac == 0) { // sayacın 0 ı geçmesi asal olmadığını gösterir
            System.out.println(sayı + " Asal bir sayıdır.");
        } else {
            System.out.println(sayı + " Asal bir sayı değildir.");
        }
    }
}
