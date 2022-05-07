package smallprojects; //@ author Saffet Demir

import java.util.Scanner;

public class Kalorihesabı {

    public static void main(String[] args) { // Ana metot
        Scanner scan = new Scanner(System.in);
        System.out.println("Cinsiyete göre kalori hesabı yapma program");
        System.out.print("Cinsiyetinizi giriniz : ");
        String cinsiyet = scan.nextLine();
        System.out.print("Adım sayısını giriniz : ");
        double adım = scan.nextDouble();
        long kalori;
        if (cinsiyet.equalsIgnoreCase("erkek")) {
            kalori = (long) ((adım * 45) / 500);
        } else {
            kalori = (long) ((adım * 30) / 500);
        }
        System.out.println("Yakılan kalori miktarı = " + kalori);
    }
}