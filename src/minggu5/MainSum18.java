package minggu5;
import java.util.Scanner;
public class MainSum18 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah perusahaan: ");
        int jumlahPerusahaan = sc18.nextInt();
        Sum18[] sm = new Sum18[jumlahPerusahaan];
        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.print("Masukkan jumlah bulan untuk perusahaan ke-" + (i + 1) + ": ");
            int jumlahBulan = sc18.nextInt();
            sm[i] = new Sum18(jumlahBulan);

            System.out.println("Masukkan keuntungan untuk perusahaan ke-" + (i + 1) + ":");
            for (int j = 0; j < sm[i].elemen; j++) {
                System.out.print("Masukkan untung bulan ke-" + (j + 1) + " = ");
                sm[i].keuntungan[j] = sc18.nextDouble();
            }
            System.out.println("====================================================");
        }
        System.out.println("====================================================");
        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("Perusahaan ke-" + (i + 1));
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + sm[i].elemen + " bulan adalah = " + sm[i].totalBF(sm[i].keuntungan));
            System.out.println("====================================================");
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan selama " + sm[i].elemen + " bulan adalah = " + sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen - 1));
            System.out.println("====================================================");
        }
    }
}


