package algoritmalabödevler;//@Saffetdmr7

import java.util.Scanner;

public class Algoritmalabödev1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//Klavye tanımlanması
        System.out.println("Sayı veya Kelime yazın");// kullanıcıdan işlem istenir.
        System.out.println("Palindrom olup olmadığını kontrol edelim : ");
        String user = scan.next();// İşlem girilir.
        do {//İşlem tipine göre metotlara yönlendirme yapılır.
            if (user.equalsIgnoreCase("sayi")) {// palindromik sayı bölümü
                palindromsayı();
                System.exit(0);
            } else if (user.equalsIgnoreCase("kelime")) {// Palindromik kelime bölümü
                palindromikkelime();
                System.exit(0);
            }
            else if (user.equalsIgnoreCase("dur")) {
                System.out.println("Program durduruldu.");
                System.exit(0);
            }
            else { //İşlemin yalış girilmesi durumunda devreye girer
                System.out.println("Lütfen sayı veya kelime yazınız");
                System.out.println("Programı durdurmak için (dur) yazınız");
            }
            user = scan.next();
        } while (user.equalsIgnoreCase("dur"));
    }

    public static void palindromsayı() { // palindromik sayı metot
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir tamsayı giriniz : ");
        int usersayı = scan.nextInt(); // kullanıcıdan istenen değer
        int sayıkayıt = usersayı; // kullanıcıdan istenen değer işlem için kaydedilir.
        int kalan, terssayı = 0;
        int basamaksayısı = String.valueOf(usersayı).length();
        for (int i = 0; i < basamaksayısı; i++) { //sayının tersi alınır ve sayı değişkenine atanır.
            kalan = sayıkayıt % 10;
            terssayı = terssayı * 10 + kalan;
            sayıkayıt = sayıkayıt / 10;
        }
        if (usersayı != terssayı) {
            System.out.println("Palindrom bir sayı değildir.");
            System.out.println("Girdiğiniz sayı : " + usersayı);
            System.out.println("Sayının tersi    : " + terssayı);
        } else {
            System.out.println("Palindrom bir sayıdır.");
            System.out.println(usersayı);
        }
    }

    public static void palindromikkelime() { // palindromik kelime metot
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir kelime giriniz : ");
        String kullanıcı = scan.nextLine();// Kullanıcıdan ifade istenir
        String kullanıcıBosluksuz = kullanıcı.replaceAll("\\s+", "");// ifadedeki boşluklar kaldırılır.
        String terskullanıcı = "";
        String terskullanıcı2 = "";
        for (int i = kullanıcı.length() - 1; i >= 0; i--) {//kullanıcıdan alınan ifade birebir ters olarak
            terskullanıcı2 = terskullanıcı2 + kullanıcı.charAt(i);// terskullanıcı2 değişkenine aktarılır
        }
        for (int i = kullanıcıBosluksuz.length() - 1; i >= 0; i--) {             //Boşluk duyarlılığı kaldırılır.
            terskullanıcı = terskullanıcı + kullanıcıBosluksuz.charAt(i);//terskullanıcı değişkenine atanır.
        }
        if (terskullanıcı.equalsIgnoreCase(kullanıcıBosluksuz)) {//boşluk duyarlılığı kaldırılmış ifade
            System.out.println("Palindromik bir ifadedir : ");        //tersi ile karşılaştırılır. 
            System.out.println(kullanıcı);
        } else {
            System.out.println("Palindromik bir ifade değildir : ");
            System.out.println(kullanıcı);
            System.out.println(terskullanıcı2);
        }
    }
}
