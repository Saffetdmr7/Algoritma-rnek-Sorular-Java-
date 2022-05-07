package smallprojects;

import java.util.Scanner;

public class Girilensayıyagöregünbulma {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String hafta[] = {"pts", "salı", "car", "per", "cuma", "cmts", "pzr"};
        System.out.println("bir sayı gir");
        int sayı = scan.nextInt();
        System.out.println("gün : " + hafta[sayı - 1]);
    }
}
