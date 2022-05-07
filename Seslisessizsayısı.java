/*
Girilen metindeki sesli ve sessiz harflerin sayısını bulan java kodunu yazınız.
 */
package javaapplication56;

import java.util.Scanner;

public class Seslisessizsayısı {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char dizi[] = {'a', 'e', 'ı', 'ü', 'i', 'ö', 'u', 'o'};
        int sesli = 0;
        System.out.println("Bir metin giriniz : ");
        String metin = scan.nextLine();
        metin = metin.toLowerCase();
        metin = metin.replaceAll("\\s+", "");
        for (int i = 0; i < metin.length(); i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (metin.charAt(i) == dizi[j]) {
                    sesli++;
                    break;
                }
            }
        }
        System.out.println("sesli harf sayısı "+sesli);
        System.out.println("sessiz harf sayısı "+(metin.length()-sesli));
    }

}
