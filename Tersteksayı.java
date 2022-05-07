package smallprojects;

import java.util.Scanner;

public class Tersteksayı {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi = scan.nextInt();
        int kalan;
        int sayıkayıt = sayi;
        int terssayı = 0;
        int basamaksayısı = String.valueOf(sayi).length();
        for (int i = 0; i < basamaksayısı; i++) {
            kalan = sayıkayıt % 10;
            terssayı = terssayı * 10 + kalan;
            sayıkayıt = sayıkayıt / 10;
        }
        if ((sayi+terssayı)%2==0) {
            System.out.println("ters çift sayı");
            
        } else {
            System.out.println("tersteksayı");
        }
    }

}
