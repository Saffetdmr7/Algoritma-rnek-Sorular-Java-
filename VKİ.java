package smallprojects; //@ author Saffet Demir

import java.util.Scanner;

public class VKİ {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Vücut kütle indeksi programı ");
        System.out.print("Kilonuzu giriniz : ");
        double kilo = scan.nextDouble();
        System.out.print("Boyunuzu cm cinsinden giriniz : ");
        double boy = scan.nextDouble();
        double vki = kilo / (boy * boy / 10000);
        System.out.println(vki);
    }
}
