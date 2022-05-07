package smallprojects; //@ author Saffet Demir
import java.util.Scanner;
public class Nothesabı {
    public static void main(String[] args) { // Ana metot
        Scanner scan = new Scanner(System.in);

        System.out.println("not hesaplama uygulamasına hoşgeldiniz");
        System.out.print("Vize notunuzu giriniz : ");
        float vize = scan.nextFloat();
        System.out.print("Final notunuzu giriniz : ");
        float fınal = scan.nextFloat();
        float ortalama = ((vize * 4 / 10) + (fınal * 6 / 10));
        if (fınal >= 50) {
            System.out.println("Ortalamanız = "+ortalama);
            if (ortalama >= 50) {
                System.out.println("Geçtiniz:)");
            } else {
                System.out.println("Ortalamanız 50 altında olduğu için geçemediniz:(");
            }
        } else {
            System.out.println("Ortalamanız = "+ortalama);
            System.out.println("Final notunuz 50 altında olduğu için geçemediniz:(");
        }
    }
}
