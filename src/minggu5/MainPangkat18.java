package minggu5;
import java.util.Scanner;
public class MainPangkat18 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);
        System.out.println("===============================================");
        System.out.println("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc18.nextInt();

        Pangkat18[] png = new Pangkat18[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
            int nilai = sc18.nextInt();
            System.out.println("Masukkan nilai pemangkat: ");
            int pangkat = sc18.nextInt();
            png[i] = new Pangkat18(nilai, pangkat); 
        }
        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                    + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                    + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
    }
}

