package normalprojects;

import java.util.Scanner;

public class Üçsayısıralama {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Tamsayı karşılaştırma programına hoşgeldiniz");
        System.out.print("İlksayıyı giriniz : ");
        long sayı1 = scan.nextLong();
        System.out.print("İkinci sayıyı giriniz : ");
        long sayı2 = scan.nextLong();
        System.out.print("Üçüncü sayıyı giriniz : ");
        long sayı3 = scan.nextLong();

        if (sayı1 == sayı2 && sayı1 == sayı3) {
            System.out.println(sayı1 + "=" + sayı2 + "=" + sayı3);
        } 
        else if (sayı1 == sayı2 && sayı1 > sayı3) {
            System.out.println(sayı1 + "=" + sayı2 + ">" + sayı3);
        } 
        else if (sayı1 == sayı2 && sayı1 < sayı3) {
            System.out.println(sayı3 + ">" + sayı1 + "=" + sayı2);
        }
        else if (sayı1 == sayı3 && sayı1 > sayı2) {
            System.out.println(sayı1 + "=" + sayı3 + ">" + sayı2);
        } 
        else if (sayı1 == sayı3 && sayı1 < sayı2) {
            System.out.println(sayı2 + ">" + sayı1 + "=" + sayı3);
        } 
        else if (sayı2 == sayı3 && sayı2 > sayı1) {
            System.out.println(sayı2 + "=" + sayı3 + ">" + sayı1);
        } 
        else if (sayı2 == sayı3 && sayı2 < sayı1) {
            System.out.println(sayı1 + ">" + sayı2 + "=" + sayı3);
        } 
        else if (sayı1 > sayı2 && sayı2 > sayı3) {
            System.out.println(sayı1 + ">" + sayı2 + ">" + sayı3);
        } 
        else if (sayı1 > sayı3 && sayı3 > sayı2) {
            System.out.println(sayı1 + ">" + sayı3 + ">" + sayı2);
        } 
        else if (sayı2 > sayı1 && sayı1 > sayı3) {
            System.out.println(sayı2 + ">" + sayı1 + ">" + sayı3);
        }
        else if (sayı2 > sayı3 && sayı3 > sayı1) {
            System.out.println(sayı2 + ">" + sayı3 + ">" + sayı1);
        } 
        else if (sayı3 > sayı1 && sayı1 > sayı2) {
            System.out.println(sayı3 + ">" + sayı1 + ">" + sayı2);
        }
        else {
            System.out.println(sayı3 + ">" + sayı2 + ">" + sayı1);
        }
    }
}