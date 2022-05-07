package normalprojects; //@ author Saffet Demir

import java.util.Scanner;

public class Ikibilinmeyenlidenklem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("AX^2+BX+C şeklinde ikinci derecen bir denklemde");
        System.out.print("x^2 nin katsayısını giriniz : ");
        double a = scan.nextDouble();
        System.out.print("x in katsayısını giriniz : ");
        double b = scan.nextDouble();
        System.out.print("sabit sayıyı giriniz : ");
        double c = scan.nextDouble();
        double kok1;
        double kok2;
        double d = (b * b) - (4 * a * c);
        if (d > 0) {
            kok1 = ((-b) - Math.sqrt(d)) / a / 2;
            kok2 = ((-b) + Math.sqrt(d)) / a / 2;
            System.out.println("Denklemin iki gerçek kökü vardır");
            System.out.println("Denklemin birinci gerçek kökü = " + kok1);
            System.out.println("Denklemin ikinci gerçek kökü = " + kok2);
        } else if (d == 0) {
             kok2 = kok1 = (-b) / (2 * a);
            System.out.println("Denklemin tek gerçek kökü vardır  = " + kok1);
        } else {
            System.out.println("Denklemin gerçek kökü yoktur.");
        }
    }
}
