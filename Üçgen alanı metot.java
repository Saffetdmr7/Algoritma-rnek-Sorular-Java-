/*
√(u(u-a)(u-b)(u-c))
2u=a+b+c
 */
package algoritmalabödevler;

import java.util.Scanner;

public class ÜçgenAlan {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sırayla tamsayı cinsinden 3 kenarı giriniz : ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a < (b + c) && b < (a + c) && c < (a + b)) {
            alan(a, b, c);
        }
        else{
            System.out.println("Girilen sayılar üçgen oluşturmaz.");
        }
    }

    public static void alan(int a, int b, int c) {
        double u = (a + b + c) / 2.0;
        double s = (u * (u - a) * (u - b) * (u - c));
        System.out.println(Math.sqrt(s));
    }

}
