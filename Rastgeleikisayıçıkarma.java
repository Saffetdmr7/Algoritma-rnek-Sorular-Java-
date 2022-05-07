package smallprojects;

import java.util.Scanner;

public class Rastgeleikisayıçıkarma {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayı1 = (int) (Math.random() * 10);
        int sayı2 = (int) (Math.random() * 10);

        if (sayı2 < sayı1) {
            int tasıyıcı = sayı1;
            sayı1 = sayı2;
            sayı2 = tasıyıcı;
        }
        System.out.print(sayı2 + "-" + sayı1 + " kaçtır : ");
        int cevap = scan.nextInt();
        if (sayı2 - sayı1 == cevap) {
            System.out.println("Cevap doğru");
        } else {
            System.out.println("Cevabın yanlış");
            System.out.println("Doğru cevap: \n" + sayı2 + "-" + sayı1 + "=" + (sayı2 - sayı1));
        }
    }

}
