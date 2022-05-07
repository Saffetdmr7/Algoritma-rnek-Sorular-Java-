package normalprojects;

public class Enbüyüksayıveindisi {

    public static void main(String[] args) {
        int dizi[][] = {{100, 20, 300}, {44, 55, 666}, {7, 80, 9}, {10, 11, 12}};
        int enbuyuk = dizi[0][0];
        int indis = 0, indis1 = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (enbuyuk < dizi[i][j]) {
                    enbuyuk = dizi[i][j];
                    indis = i;
                    indis1 = j;
                }
            }
        }
        System.out.println("enbuyuk"+enbuyuk);
        System.out.println("indis  ("+indis+","+indis1+")");
    }
}
