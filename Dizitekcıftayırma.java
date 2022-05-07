/*
0-100 arasında rasgele sayılardan oluşan 10 elemanlı bir dizedeki tek elemanları bir alt diziye,
çift elemanları ise başka bir alt diziye aktaran programın JAVA kodunu yazınız. 
Bu dizide ki çift mi yoksa tek elemanların sayısının fazla olduğunu çıktı olarak gösteriniz.
 */
package javaapplication56;

//import java.util.Scanner;
import java.util.Arrays;

public class Dizitekcıftayırma {

    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        int cift = 0;
        int cift1 = 0;
        int tek = 0;
        int tek1 = 0;
        int dizi[] = new int[10];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 0) {
                cift++;
            } else {
                tek++;
            }
        }

        int ciftdizi[] = new int[cift];
        int tekdizi[] = new int[tek];
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 0) {
                ciftdizi[cift1] = dizi[i];
                cift1 += 1;
            } else {
                tekdizi[tek1] = dizi[i];
                tek1 += 1;
            }
        }
        System.out.println("normal dizi" + Arrays.toString(dizi));
        System.out.println("çift dizi " + Arrays.toString(ciftdizi));
        System.out.println("tek dizi " + Arrays.toString(tekdizi));
    }
}
