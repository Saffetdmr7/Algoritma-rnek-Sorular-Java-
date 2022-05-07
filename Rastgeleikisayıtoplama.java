package normalprojects;

import java.util.Scanner;

public class Rastgeleikisayıtoplama {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayı1 = (int) (Math.random() * 100)+1;
        int sayı2 = (int) (Math.random() * 100)+1;
        int sayac = 1;
        System.out.print(sayı1 + "+" + sayı2 + " = \nsonucu nedir: ");
        double cevap = scan.nextDouble();
        while (sayı1 + sayı2 != cevap) {
            sayac++;
            sayı1 = (int) (Math.random() * 100);
            sayı2 = (int) (Math.random() * 100);
            System.out.println("Yanlış cevap");
            System.out.print(sayı1 + "+" + sayı2 + " = \nsonucu nedir: ");
            cevap = scan.nextInt();
        }
        System.out.println("Tebrikler " + sayac + ". denemede bildiniz");
    }
}
