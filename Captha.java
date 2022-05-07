/*
Dışarıdan adet değerini alarak büyük harf, küçük harf ve rakamdan oluşan 
rasgele CAPTHA (güvenlik anahtarı) oluşturunuz.
( Güvenlik anahtarı uzunluğu 10 olsun.)
Büyük harf adedini giriniz -> 3
Küçük harf adedini giriniz -> 3
Rakam adedini giriniz->4
Captha: z2AU34iTp7   
 */
package normalprojects;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Captha {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("/*\n"
                + "Dışarıdan adet değerini alarak büyük harf, küçük harf ve rakamdan oluşan \n"
                + "rasgele CAPTHA (güvenlik anahtarı) oluşturunuz.\n"
                + "( Güvenlik anahtarı uzunluğu 10 olsun.)\n"
                + "Büyük harf adedini giriniz -> 3\n"
                + "Küçük harf adedini giriniz -> 3\n"
                + "Rakam adedini giriniz->4\n"
                + "Captha: z2AU34iTp7   \n"
                + " */");
        //dizilerde işlem yapabilmek için ArraysList kullanıldı
        List<String> captha = new ArrayList<>();
        //diziler tanımlandı
        String kucuk[] = {"a", "e", "ı", "o", "u", "ü", "i", "ö", "q", "w", "r", "t", "y", "p", "ğ", "s", "d", "f",
            "g", "h", "j", "k", "l", "ş", "z", "x", "c", "v", "b", "n", "m", "ç", "A", "E", "I", "O", "U",
            "Ü", "İ", "Ö", "Q", "W", "R", "T", "Y", "P", "Ğ", "S", "D", "F",
            "G", "H", "J", "K", "L", "Ş", "Z", "X", "C", "V", "B", "N", "M", "Ç"};
        String buyuk[] = {"A", "E", "I", "O", "U", "Ü", "İ", "Ö", "Q", "W", "R", "T", "Y", "P", "Ğ", "S", "D", "F",
            "G", "H", "J", "K", "L", "Ş", "Z", "X", "C", "V", "B", "N", "M", "Ç"};
        String rakam[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String karakter[] = {"!", "%", "&", "/", "?", "_", "-", ".", ",", "+", "*", "$", "#", ">", "<", "|"};
        //Kullanıcıdan giriş alınır
        System.out.println("CAPTHA oluşturmak için karakter sayıları seçiniz");
        System.out.println("Girdiğiniz sayıların toplamı 0-20 arasında olsun");
        System.out.print("Büyük harf adedini giriniz -> ");
        byte bharf = scan.nextByte();
        System.out.print("Küçük harf adedini giriniz -> ");
        byte kharf = scan.nextByte();
        System.out.print("Rakam adedini giriniz-> ");
        byte sayı = scan.nextByte();
        System.out.print("Karakter adedini giriniz-> ");
        byte karak = scan.nextByte();
        String capthaSon = "";//boş string sıralı bir şekilde kullanıcının istediğini yapar
        if ((bharf + kharf + sayı + karak) > 0 && (bharf + kharf + sayı + karak) < 20 && bharf > 0 && kharf > 0 && sayı > 0 && karak > 0) {
            for (int i = 0; i < bharf; i++) {//Büyük harfin eklendiği bölüm 
                captha.add(buyuk[(int) (Math.random() * 32)]);
            }
            for (int i = 0; i < kharf; i++) {//küçük harfin eklenişi
                captha.add(kucuk[(int) (Math.random() * 32)]);
            }
            for (int i = 0; i < sayı; i++) {//rakam eklenişi
                captha.add(rakam[(int) (Math.random() * 10)]);
            }
            for (int i = 0; i < karak; i++) {//karakter eklenişi
                captha.add(karakter[(int) (Math.random() * 16)]);
            }
            //  System.out.println(captha);//yazdırıp çalışıp çalışmadığını kontrol ettik
            for (int i = 0; i < (bharf + kharf + sayı + karak); i++) {//alınan bütün karakterleri karıştırdık
                int a = (int) (Math.random() * captha.size());
                capthaSon += captha.get(a);
                captha.remove(a);//Stringe eklenen elemanı diziden siler
            }
            System.out.println(capthaSon);//Captha yazdırılır.
        } else {
            System.out.println("Lütfen adet toplamı 0-20 arasında olsun");
        }
    }
}
