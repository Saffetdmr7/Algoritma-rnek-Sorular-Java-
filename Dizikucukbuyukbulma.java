package javaapplication56;

/*
0-100 arasında rasgele sayılardan oluşan 20 elemanlı bir dizi oluşturunuz. Bu dizinin;
a)	En küçük elemanını,
b)	En büyük elemanını bulan programın JAVA kodunu yazınız.
 */
public class Dizikucukbuyukbulma {

    public static void main(String[] args) {
        int dizi[] = new int[20];
        for (int i = 0; i < dizi.length; i++) {
            int a = (int) (Math.random() * 101);
            dizi[i] = a;
        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + "_");
        }
        System.out.println();
        gucuk(dizi);
        buyuk(dizi);
    }
public static void gucuk(int dizi[]){
    int enkucuk = dizi[0];
    for (int i = 0; i < dizi.length; i++) {
            if (enkucuk > dizi[i]) {
                int temp = dizi[i];
                dizi[i] = enkucuk;
                enkucuk = temp;
            }
        }
    System.out.println("en kucuk ="+enkucuk);
}
public static void buyuk(int dizi[]){
     int enbuyuk = dizi[dizi.length-1];
        for (int i = dizi.length-1; i >=0; i--) {
            if (enbuyuk<dizi[i]) {
                int kayıt = dizi[i];
                dizi[i] = enbuyuk;
                enbuyuk = kayıt;
            }
        }
    System.out.println("en buyuk ="+enbuyuk);
}

}
