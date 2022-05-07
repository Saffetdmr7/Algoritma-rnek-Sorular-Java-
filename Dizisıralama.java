/*
0-20 arasında rasgele sayılardan oluşan 5 elemanlı bir diziyi
küçükten büyüğe doğru sıralayan programın JAVA kodunu yazınız. 
(Hazır fonksiyon kullanılmayacaktır.)
 */
package javaapplication56;

import java.util.Arrays;

public class Dizisıralama {

    public static void main(String[] args) {
        int dizi[] = new int[5];
        int temp;
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 20);
        }
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[i]<dizi[j]) {
                    temp = dizi[j];
                    dizi[j] = dizi[i];
                    dizi[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(dizi));
    }

}
