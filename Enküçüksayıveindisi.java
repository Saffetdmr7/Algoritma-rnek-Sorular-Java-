
package normalprojects;

public class Enküçüksayıveindisi {

  
    public static void main(String[] args) {
        int dizi[]={10,24,30,4,40,14,2,5,7,3,7,65,4,70,7,15,1,2,4,2,5,3,7,5,4,8};
        int enkucuk = dizi[0];
        int indis=0;
        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i]<enkucuk) {
                enkucuk=dizi[i];
                indis=i;
            }
        }
        System.out.println(enkucuk);
        System.out.println(indis+"*");
    }
    
}
