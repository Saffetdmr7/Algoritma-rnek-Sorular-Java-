package algoritmalabödevler;

/*
1. Bir parola en az 8 karakterden olusmalı.
2. Bir parola yalızca harf ve rakamlardan olusur.
3. Bir parola en az 2 sayı içermelidir.
 */
import java.util.Scanner;

public class ParolaKontrol {

    public static void main(String[] args) {
        System.out.println("/*\n"
                + "1. Bir parola en az 8 karakterden olusmalı.\n"
                + "2. Bir parola yalızca harf ve rakamlardan olusur.\n"
                + "3. Bir parola en az 2 sayı içermelidir.\n"
                + " */");
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir şifre oluşturunuz : ");
        String sifre = scan.nextLine();
        Sifre(sifre);
    }

    public static void Sifre(String sifre) {

        int sayac = 0;
        int kaydedici = 0;
        char rakam[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char harf[] = {'a', 'e', 'ı', 'o', 'u', 'ü', 'i', 'ö', 'q', 'w', 'r', 't', 'y', 'p', 'ğ', 's', 'd', 'f',
            'g', 'h', 'j', 'k', 'l', 'ş', 'z', 'x', 'c', 'v', 'b', 'n', 'm', 'ç', 'A', 'E', 'I', 'O', 'U',
            'Ü', 'İ', 'Ö', 'Q', 'W', 'R', 'T', 'Y', 'P', 'Ğ', 'S', 'D', 'F',
            'G', 'H', 'J', 'K', 'L', 'Ş', 'Z', 'X', 'C', 'V', 'B', 'N', 'M', 'Ç'};
        if (sifre.length() >= 8) {
            for (int i = 0; i < sifre.length(); i++) {
                for (int j = 0; j < rakam.length; j++) {
                    if (sifre.charAt(i) == rakam[j]) {
                        sayac++;
                    }
                }
                for (int a = 0; a < harf.length; a++) {
                    if (sifre.charAt(i) == harf[a]) {
                        kaydedici++;
                    }
                }
            }
            System.out.println(sifre);
            if (sayac >= 2 && (sayac + kaydedici) == sifre.length() && kaydedici > 0) {
                System.out.println("Geçerli şifre");
            } else {
                System.out.println("Geçersiz şifre");
            }
        } else {
            System.out.println("Geçersiz şifre");
        }

    }

}
