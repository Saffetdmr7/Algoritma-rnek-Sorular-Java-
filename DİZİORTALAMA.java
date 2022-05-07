/*
0-50 arasında rasgele sayılardan oluşan 10 elemanlı bir dizinin elemanlarının ortalamasından
küçük ve büyük olan elemanların sayısını bulan programın JAVA kodunu yazınız.

 */
package javaapplication56;

import java.util.Scanner;
import java.util.Arrays;

public class DİZİORTALAMA {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dizi[] = new int[10];
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 50);
        }
        for (int i = 0; i < dizi.length; i++) {
            toplam += dizi[i];
        }
        System.out.println(toplam);
        double ortalama = (double)toplam / 10;
        int sayac = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] > ortalama) {
                sayac++;
            }
        }
        System.out.println(Arrays.toString(dizi));
        System.out.println(ortalama + " ortalaması üzerinde olan " + sayac + " tane sayı vardır.");
        System.out.println(ortalama + " ortalaması altında olan " + (10-sayac) + " tane sayı vardır.");

    }

}
