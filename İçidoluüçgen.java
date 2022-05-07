package normalprojects;

import java.util.Scanner;

public class İçidoluüçgen {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("sütun sayısı giriniz : ");
        int sütun = scan.nextInt();
        int yıldız = 1, bosluk = sütun;
        for (int i = 0; i < sütun; i++) {
            for (int j = bosluk; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < yıldız; k++) {
                System.out.print("*");
            }
            yıldız += 2;
            bosluk -= 1;
            System.out.println("");
        }
    }

}
