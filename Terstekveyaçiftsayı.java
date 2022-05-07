package javaapplication56;

import java.util.Scanner;

public class Terstekveyaçiftsayı {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double kaydedici = 0;
        System.out.print("Bir sayı giriniz : ");
        double sayı = scan.nextDouble();
        while(sayı != 0){
           kaydedici = sayı % 10 ;
        }
        
    }

}
