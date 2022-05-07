package javaapplication56;

import java.util.Scanner;

public class Diziilkvesonelemanortalama {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double sayac = 0;
        System.out.print("Dizinin boyutunu giriniz : ");
        int a = scan.nextInt();
        System.out.println("Elemanları giriniz : ");
        double [] dizi = new double[a];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = scan.nextInt();
        }
        int b = dizi.length-1;
        double kayıt = dizi[b]+dizi[0];
        for (int i = 0; i < dizi.length; i++) {
            sayac += dizi[i]; 
        }
        double oran = (kayıt/sayac)*100;
        System.out.print("İlk ve son eleman toplamının ortalamaya oranı %"+oran);
    }
}