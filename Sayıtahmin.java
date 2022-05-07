package javaapplication56;

/*
0-20 arasında rasgele sayılardan oluşan 20 elemanlı bir dizide sayı tahmin oyunu oynanacaktır.
Kullanıcı klavyeden 5 farklı sayı girecek bu sayılardan eğer 3 veya 
daha fazlası bu dizide varsa ekrana “Kazandınız” aksi halde “Kaybettiniz” yazdıran
programın JAVA kodunu yazınız.
 */
import java.util.Scanner;
// import java.util.Arrays;

public class Sayıtahmin {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı tahmin oyununa hoşgeldiniz"
                + "5 te 3 doğru tahmin yapan kazanır");
        int dizi[] = new int[20];
        int sayac  = 0;
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 20);
        }
     //   System.out.println(Arrays.toString(dizi));
        System.out.println("5 tane tamsayı giriniz arka arkaya");
        for (int i = 0; i < 5; i++) {
            int sayı = scan.nextInt();
            for (int J = 0; J < dizi.length; J++) {
                if (sayı == dizi[J]) {
                    sayac++;
                    break;
                }
            }
        }
        if (sayac >= 3) {
            System.out.println("Kazandınız "
            +sayac);
        }
        else{
            System.out.println("Kaybettiniz "
                    + sayac);
        }
    }

}
