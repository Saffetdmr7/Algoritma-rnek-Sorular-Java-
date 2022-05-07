package smallprojects; //@ author Saffet Demir

import java.util.Scanner;

public class Faktoriyel {

    public static void main(String[] args) { // Ana metot
        Scanner scan = new Scanner(System.in);

        System.out.print("1 den büyük bir tamsayı giriniz : "); // Veri girişi
        long sayı = scan.nextLong();
        long sonuc = 1;

        for (int i = 1; i <= sayı; i++) {
            sonuc *= i;
        }
        System.out.println("Faktoriyel işlemi sonucunuz = " + sonuc);
    }

}
