/*
Sahte kitap basımını önlemek için; ISBN-10 (Uluslararası Standart Kitap Numarası) 10 haneden oluşur: d1d2d3d4d5d6d7d8d9d10. Son hane olan d10, aşağıdaki formül kullanarak hesaplanır;
(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9)%11
Eğer yukarıdaki çıktıya göre kalan 10 ise, son rakam ISBN-10 kurallarına göre D10 = X olarak gösterilir. Kullanıcıdan ilk 9 haneyi girmesini isteyen ve 10 basamaklı ISBN’yi (baştaki 0’lar dâhil) görüntüleyen bir program yazınız. İşte örnek çalışmalar:
Çıktı: 	Bir ISBN’nin ilk 9 hanesini tamsayı olarak girin: 013601267 
ISBN-10 numarası 0136012671
-------------------------------------------------------------------------
Bir ISBN’nin ilk 9 hanesini tamsayı olarak girin: 013031997
ISBN-10 numarası 013031997X
 */
package javaapplication56;

import java.util.Scanner;

public class ISBN10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir ISBN’nin ilk 9 hanesini tamsayı olarak girin:");// veri girişi istenir
        int giris = scan.nextInt();// veri girişi 
        int kaydedici = giris;// işlemler için kaydedilir
        int dizi[] = new int[9];//dizi atanır 9 hane için
        byte a = 9;//dizi hanelerini çarpmak için atandı
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++) {//girilen sayının elemanları diziye atanır
            dizi[i] = (kaydedici % 10);
            kaydedici = kaydedici - (kaydedici % 10);
            kaydedici /= 10;
        }
        for (int i = 0; i < dizi.length; i++) {//elemanlar formüle göre çarpılıp toplanır
            toplam = toplam + dizi[i] * a;
            a--;
        }
        toplam = toplam % 11;//toplam sayının mod 11 i alınır 
        for (int i = dizi.length - 1; i >= 0; i--) {
            System.out.print(dizi[i]);
        }
        if (toplam == 10) {
            System.out.println("x");
        } else {
            System.out.println(toplam);
        }
    }
}
