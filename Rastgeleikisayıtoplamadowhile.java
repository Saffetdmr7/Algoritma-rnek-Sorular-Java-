package normalprojects;

import java.util.Scanner;

public class Rastgeleikisayıtoplamadowhile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayı1=(int)(Math.random()*100)+1;
        int sayı2=(int)(Math.random()*100)+1;

        
       double tahmin;
        do {
            System.out.println(sayı1+"+"+sayı2+" Kaçtır");
            tahmin = scan.nextDouble();
            if (tahmin==(sayı1+sayı2)) {
                System.out.println("Tebrikler bildiniz");
                System.exit(0);
            }
            else{
                System.out.println("Bir daha deneyiniz");
            }
        } while (tahmin != 0);
    }
}