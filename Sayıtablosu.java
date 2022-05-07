package normalprojects;
//import java.util.Scanner;

public class Sayıtablosu {

    public static void main(String[] args) {
        //     Scanner scan=new Scanner(System.in);
        for (int i = 0; i <= 9; i++) {
            System.out.print(i + " | ");
            for (int j = 0; j <= 9; j++) {
                System.out.printf("   %d%d", i, j);
            }
            System.out.println();
        }

    }

}
