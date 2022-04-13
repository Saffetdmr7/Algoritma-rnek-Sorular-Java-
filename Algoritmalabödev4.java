package algoritmalabödevler;

import java.util.Scanner;

public class Algoritmalabödev4 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir dize giriniz : ");
        String dize = scan.nextLine();
        String dize1 = dize.replaceAll("\\s+","");
        Middlechar(dize1);
    }

    public static void Middlechar(String dize) {
        if (dize.length() % 2 == 0) {
            System.out.println(dize.charAt(dize.length()/2-1));
            System.out.println(dize.charAt(dize.length()/2));
        }
        else{
            int a = (dize.length()/2)+(1/2);
            System.out.println(dize.charAt(a));
        }
    }
    
}
