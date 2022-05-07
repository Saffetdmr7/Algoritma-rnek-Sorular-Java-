package smallprojects; //@ author Saffet Demir

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) { // Ana metot
        Scanner scan = new Scanner(System.in);

        System.out.println("Fibonacci sayı dizisine hoşgeldiniz");
        System.out.println("Kaçıncı elemana kadar yazdırılsın?");
        double sayı = scan.nextDouble();
        int d1 = 1, d2 = 1, d3;
        System.out.print(d1 + " " + d1 + " ");
        for (int i = 2; i < sayı; i++) {
            d3 = d1 + d2;
            d1 = d2;
            d2 = d3;
            System.out.print(d3 + " ");
        }
    }
}