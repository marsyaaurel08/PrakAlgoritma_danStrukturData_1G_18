package Pertemuan8_Jobsheet7;
import java.util.Scanner;

public class Utama18 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas gudang: ");
        int kapasitas = sc18.nextInt();
        sc18.nextLine();
        
        Gudang18 gudang = new Gudang18(kapasitas);

        while(true){
            System.out.println("\nMenu: ");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Lihat Barang Teratas");
            System.out.println("4. Tampilkan Tumpukan Barang");
            System.out.println("5. Keluar");
            System.out.print("Pilih Operasi: ");
            int pilihan = sc18.nextInt();
            sc18.nextLine();

            switch (pilihan){
                case 1: 
                    System.out.print("Masukkan Kode Barang: ");
                    int kode = sc18.nextInt();
                    sc18.nextLine();
                    System.out.print("Masukkan Nama Barang: ");
                    String nama = sc18.nextLine();
                    System.out.print("Masukkan Kategori: ");
                    String kategori = sc18.nextLine();
                    Barang18 barangBaru = new Barang18(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.lihatBarangTeratas();
                    break;
                case 4: 
                    gudang.tampilkanBarang();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi");
            }
        }
    }
}
