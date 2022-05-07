/*
3 arkadaş askerde canı sıkıldığı için bir karton kutuya 10 adet küçük kağıtlara
0-100 arasında rastgele sayılar yazıp atmışlardır.
Birinci kişi Elazığlı olduğu için ilk kağıdı o çekmiştir.
Sonra Bursalı 2. Kişi en sonda Malatyalı 3. Kişi bir kağıt çekmiştir.
Bu 3 kişiden en büyük sayıyı çeken oyunu kazanacaktır. 
Oyunu kazanan oyuncunun hangi şehirli olduğunu
ekrana yazdıran programın JAVA kodunu yazınız.
 */
package javaapplication56;
import java.util.Arrays;
public class Kagıtcekmeoyunu {

    public static void main(String[] args) {
        int dizi[] = new int [10];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(dizi));
        int elazıg = dizi[(int)(Math.random()*10)];
        int bursa = dizi[(int)(Math.random()*10)];
        int malatya = dizi[(int)(Math.random()*10)];
        System.out.println(elazıg+"eb"+bursa+"bm"+malatya);
        System.out.println(Math.max(bursa, Math.max(elazıg, malatya)));
    }
    
}
