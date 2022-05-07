package normalprojects;

import java.util.Scanner;

public class Taşkağıtmakas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b = (int) (Math.random() * 2)-1;
        /*
        0tas
        1kagıt
        2makas
         */
        System.out.println("Taş kağıt makas oyununa hoşgeldiniz : ");
        System.out.print("Tas"+","+"kagit"+","+"makas"+"\nseçenlerinden birini yazınız : ");
        String sonuc = scan.next();
        if (sonuc.equalsIgnoreCase("tas")) {
            if (b == 0) {
                System.out.println("Bilgisayarın tahmini = Taş");
                System.out.println("berabere");
            } else if (b == 1) {
                System.out.println("Bilgisayarın tahmini = Kağıt");
                System.out.println("Bilgisayar kazandı");
            } else {
                System.out.println("Bilgisayarın tahmini = Makas");
                System.out.println("Kazandınız");
            }
        } else if (sonuc.equalsIgnoreCase("Kagit")) {
            if (b == 0) {
                System.out.println("Bilgisayarın tahmini = Taş");

                System.out.println("Kazandınız");
            } else if (b == 1) {
                System.out.println("Bilgisayarın tahmini = Kağıt");

                System.out.println("Berabere");
            } else {
                System.out.println("Bilgisayarın tahmini = Makas");

                System.out.println("Bilgisayar kazandı");
            }
        } else if (sonuc.equalsIgnoreCase("Makas")) {
            if (b == 0) {
                System.out.println("Bilgisayarın tahmini = Taş");

                System.out.println("bigisayar kazandı");
            } else if (b == 1) {
                System.out.println("Bilgisayarın tahmini = Kağıt");

                System.out.println("Kazandınız");
            } else {
                System.out.println("Bilgisayarın tahmini = Makas");

                System.out.println("Berabere");
            }
        } else {
            System.out.println("Lütfen belirtilen seçeneklerden birini yazınız.");
        }
    }
}