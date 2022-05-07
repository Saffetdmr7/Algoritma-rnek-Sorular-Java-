package javaapplication56;

/*
0-50 arasında rasgele sayılardan oluşan 25 eleman bir dizinin 5’e tam bölünebilen
elemanlarını başka bir diziye kaydeden programın JAVA kodunu yazınız.
 */
public class Dizi5ebolunme {

    public static void main(String[] args) {
        int dizi1[] = new int[25];
        int sayac = 0;
        for (int i = 0; i < dizi1.length; i++) {
            dizi1[i] = (int) (Math.random() * 50);
        }
        for (int i = 0; i < dizi1.length; i++) {
            if (dizi1[i] % 5 == 0) {
                sayac++;
            }
        }

        int dizi2[] = new int[sayac];
        int j=0;
            for (int i = 0; i < dizi1.length; i++) {
                if (dizi1[i] % 5 == 0) {
                    dizi2[j] = dizi1[i];
                    j++;
                }
            }
        
        for (int i = 0; i < dizi1.length; i++) {
            System.out.print(dizi1[i] + " - ");
        }
        System.out.println("\n");
        for (int i = 0; i < sayac; i++) {
            System.out.print(dizi2[i]+"-");
        }
    }

}
