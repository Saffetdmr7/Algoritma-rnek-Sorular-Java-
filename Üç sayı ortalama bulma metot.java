package algoritmalabödevler;

import java.util.Scanner;

public class Ortalama {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("3 sayı giriniz : ");
        double sayı1 = scan.nextDouble();
        double sayı2 = scan.nextDouble();
        double sayı3 = scan.nextDouble();
        ortalama(sayı1,sayı2,sayı3);
    }
public static void ortalama(double a,double b,double c){
    System.out.println((a+b+c)/3);
}
}
