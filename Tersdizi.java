package normalprojects;

/*
Dışarıdan elemanları girilen 10 elemanlı bir diziyi ters çeviren programın JAVA kodunu yazınız.
 */
import java.util.Scanner;

public class Tersdizi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dizi[] = new int[10];
        int tersdizi[] = new int[10];
        for (int i = 0; i < 10; i++) {
            dizi[i] = scan.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            tersdizi[dizi.length - 1 - i] = dizi[i];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(tersdizi[i]);
        }

    }

}
