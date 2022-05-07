package hesapmakinesi;

import java.util.Scanner;//veri girişi yapılır

public class Hesapmakinesi {

    public static void main(String[] args) {//Ana metot
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : \n" //ilk sayı girişi yapılır 
                + "(üs ve taban kullanılan işlemlerde taban olur)");
        double sayı = scan.nextDouble();
        System.out.println("Bir işlem giriniz : \n" //işlem girişi yapılır
                + "(- + * /  ! ^ % log10 cevre alan hacim)\n"
                + "(sin cos tan cot arcsin arccos arctan arccot sec cosec)");
        String islem = scan.next();

        if (islem.equals("!")) {//faktöriyel işlemi
            double cevap = faktoriyel(sayı);
            System.out.println((long) cevap);
            System.exit(0);
        } else if (islem.equalsIgnoreCase("log10")) {//10 tabanında logaritma ölçme
            double cevap = log10(sayı);
            System.out.println(cevap);
            System.exit(0);
        } else if (islem.equalsIgnoreCase("sin")) {//sinüs değerini ölçme
            double cevap = sin(sayı);
            System.out.println(cevap);
            System.exit(0);
        } else if (islem.equalsIgnoreCase("cos")) {//cosinüs değerini ölçme
            double cevap = cos(sayı);
            System.out.println(cevap);
            System.exit(0);
        } else if (islem.equalsIgnoreCase("tan")) {//tanjant değerini ölçme
            double cevap = tan(sayı);
            System.out.println(cevap);
            System.exit(0);
        } else if (islem.equalsIgnoreCase("cot")) {//cotanjant değerini ölçme
            double cevap = cot(sayı);
            System.out.println(cevap);
            System.exit(0);
        } else if (islem.equalsIgnoreCase("sec")) {//secant değerini ölçme
            double cevap = sec(sayı);
            System.out.println(cevap);
            System.exit(0);
        } else if (islem.equalsIgnoreCase("cosec")) {//cosecant değerini ölçme 
            double cevap = cosec(sayı);
            System.out.println(cevap);
            System.exit(0);
        } else if (islem.equalsIgnoreCase("arcsin")) {//arcsin değeri alma
            double cevap = asin(sayı);
            System.out.println(cevap);
            System.exit(0);
        } else if (islem.equalsIgnoreCase("arccos")) {//arccos değerini ölçme
            double cevap = acos(sayı);
            System.out.println(cevap);
            System.exit(0);
        } else if (islem.equalsIgnoreCase("arctan")) {//arctan değerini ölçme
            double cevap = atan(sayı);
            System.out.println(cevap);
            System.exit(0);
        } else if (islem.equalsIgnoreCase("arccot")) {//arccot değeri ölçme
            double cevap = acot(sayı);
            System.out.println(cevap);
            System.exit(0);
        } else if (islem.equals("cevre")) {//çemberde çevre öçlme
            double cevap = cevre(sayı);
            System.out.println(cevap);
            System.exit(0);
        } else if (islem.equalsIgnoreCase("alan")) {//Dairede alan
            double cevap = alan(sayı);
            System.out.println(cevap);
            System.exit(0);
        } else if (islem.equalsIgnoreCase("hacim")) {//dairede hacim
            double cevap = hacim(sayı);
            System.out.println(cevap);
            System.exit(0);
        } else {
        }
        System.out.println("İkinci sayıyı giriniz : \n" //ikinci sayı girişi yapılır
                + "(Üs ve taban kullanılan işlemlerde üs olarak kullanılır)");
        double sayı2 = scan.nextDouble();
        if (islem.equals("/")) {//Bölme işlemi
            double cevap = sayı / sayı2;
            System.out.println(cevap);
        } else if (islem.equals("*")) {//Çarpma işlemi
            double cevap = sayı * sayı2;
            System.out.println(cevap);
        } else if (islem.equals("+")) {//toplama işlemi
            double cevap = sayı + sayı2;
            System.out.println(cevap);
        } else if (islem.equals("-")) {//Çıkarma işlemi
            double a = 100000 * sayı;
            double b = 100000 * sayı2;
            sayı = (long) a;
            sayı2 = (long) b;
            double cevap = sayı - sayı2;
            System.out.println(cevap / 100000);
        } else if (islem.equalsIgnoreCase("us")) {//üs alma işlemi
            double cevap = us(sayı, sayı2);
            System.out.println((long) cevap);
            System.exit(0);
        } else if (islem.equalsIgnoreCase("log")) {//logaritma işlemi
            double cevap = log(sayı, sayı2);
            System.out.println(cevap);
            System.exit(0);
        } else {
            System.out.println("Lütfen belirtilen işlemlerden birini giriniz");
        }
    }

    static double faktoriyel(double sayı) {//faktöriyel metot
        double sonuc = 1;
        for (int i = 1; i <= sayı; i++) {
            sonuc = sonuc * i;
        }
        return sonuc;
    }

    static double log10(double sayı) {//10 tabanında logaritma metot
        double sonuc = Math.log10(sayı);
        return sonuc;
    }

    static double sin(double sayı) {//sinüs metot
        double sonuc = Math.sin(sayı);
        return sonuc;
    }

    static double cos(double sayı) {//cosinüs metot
        double sonuc = Math.cos(sayı);
        return sonuc;
    }

    static double tan(double sayı) {//tanjant metot
        double sonuc = Math.tan(sayı);
        return sonuc;
    }

    static double cot(double sayı) {//cotanjant metot
        double sonuc = (Math.cos(sayı)) / (Math.sin(sayı));
        return sonuc;
    }

    static double sec(double sayı) {//secant metot
        double a = Math.cos(sayı);
        double sonuc = 1 / a;
        return sonuc;
    }

    static double cosec(double sayı) {//cosecant metot
        double b = Math.sin(sayı);
        double sonuc = 1 / b;
        return sonuc;
    }

    static double asin(double sayı) {//arcsin metot
        double sonuc = Math.asin(sayı);
        return sonuc;
    }

    static double acos(double sayı) {//arccos metot
        double sonuc = Math.acos(sayı);
        return sonuc;
    }

    static double atan(double sayı) {//arctan metot
        double sonuc = Math.atan(sayı);
        return sonuc;
    }

    static double acot(double sayı) {//arccot metot
        double sonuc = Math.atan(sayı);
        return sonuc;
    }

    static double cevre(double sayı) {//çevre metot
        Scanner scan = new Scanner(System.in);
        System.out.println("π yi kaç almak istersiniz");//pi sayısı kullanıcıdan istenir
        double pi = scan.nextDouble();
        double sonuc = 2 * pi * sayı;
        return sonuc;
    }

    static double alan(double sayı) {//alan metot
        Scanner scan = new Scanner(System.in);
        System.out.println("π yi kaç almak istersiniz");//kullanıcıdan pi sayısını girmesi istenir
        double pi = scan.nextDouble();
        double sonuc = (2 * pi) * (sayı * sayı);
        return sonuc;
    }

    static double hacim(double sayı) {//hacim metot
        Scanner scan = new Scanner(System.in);
        System.out.println("π yi kaç almak istersiniz");//kullanıcıdan pi sayısını girmesi istenir
        double pi = scan.nextDouble();
        double sonuc = (4 * pi * (Math.pow(sayı, 3))) / 3;
        return sonuc;
    }

    static double us(double taban, double üs) {//üs alma metot
        double sonuc = Math.pow(taban, üs);
        return sonuc;
    }

    static double log(double taban, double üs) {//logaritma metot
        double sonuc = (Math.log10(üs)) / (Math.log10(taban));
        return sonuc;
    }
}
