package algoritmalabödevler;

import java.util.Scanner;

public class Algoritmalabödev2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("3 sayı giriniz : ");
        double sayı = scan.nextDouble();
        double sayı1 = scan.nextDouble();
        double sayı2 = scan.nextDouble();
        minimum(sayı, sayı1, sayı2);
    }

    public static void minimum(double sayı, double sayı1, double sayı2) {
        System.out.println(Math.min(sayı, Math.min(sayı1, sayı2)));
    }

}
