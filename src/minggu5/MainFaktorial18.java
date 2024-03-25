package minggu5;
import java.util.Scanner;
public class MainFaktorial18 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);
        System.out.println("---------------");
        System.out.println("Masukkan jumlah elemen: ");
        int iJml = sc18.nextInt();
    
        faktorial18[] fk = new faktorial18[iJml];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new faktorial18();
            System.out.println("Masukkan nilai data ke-" + (i + 1) + ":");
            int iNilai = sc18.nextInt();
            fk[i].nilai = iNilai;
        }
    
        System.out.println("HASIL - BRUTE FORCE");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil Perhitungan Faktorial Menggunakan Brute Force adalah " 
                               + fk[i].faktorialBF(fk[i].nilai));
        }
    
        System.out.println("HASIL - DIVIDE AND CONQUER");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil Penghitungan faktorial menggunakan Divide and Conquer adalah "
                               + fk[i].faktorialDC(fk[i].nilai));
        }
    }
}
