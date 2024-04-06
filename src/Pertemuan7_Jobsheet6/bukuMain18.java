package Pertemuan7_Jobsheet6;
import java.util.Scanner;

public class bukuMain18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        PencarianBuku18 data = new PencarianBuku18();
        int jumlah = 5;

        System.out.println("==================================================");
        System.out.println("Masukkan data buku urut dari kode buku terkecil: ");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("==================================================");
            System.out.print("Kode Buku    \t: ");
            String kodeBuku = s.nextLine();
            System.out.print("Judul Buku   \t: ");
            String judul = s.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit = s.nextInt();
            s.nextLine();
            System.out.print("Pengarang    \t: ");
            String pengarang = s.nextLine();
            System.out.print("Stock        \t: ");
            int stock = s.nextInt();
            s.nextLine(); 

            buku18 m = new buku18(kodeBuku, judul, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }

        System.out.println("====================================================");
        System.out.println("Data Keseluruhan Buku");
        data.tampil();

        System.out.println("====================================================");
        System.out.println("Pilih Pencarian data");
        System.out.println("1. Berdasarkan Kode");
        System.out.println("2. Berdasarkan Judul");
        System.out.print("Pilih : ");
        int pilih = s.nextInt();
        s.nextLine(); 

        if (pilih == 1) {
            System.out.print("Masukkan kode buku yang dicari : ");
            String cari = s.nextLine();

            System.out.println("Cari data menggunakan sequential search");
            int posisi = data.findSeqSearch(cari);
            data.tampilPosisi(cari, posisi);
            data.tampilData(cari, posisi);

            System.out.println("Cari data menggunakan binary search");
            posisi = data.findBinarySearch(cari, 0, jumlah - 1);
            data.tampilPosisi(cari, posisi);
            data.tampilData(cari, posisi);
            
        } else if (pilih == 2) {
            System.out.print("Masukkan Judul buku yang dicari : ");
            String cariJudul = s.nextLine();

            System.out.println("Cari data menggunakan sequential search");
            int posisiJudulS = data.findJudulSequential(cariJudul);
            data.tampilPosisi(cariJudul, posisiJudulS);
            data.tampilData(cariJudul, posisiJudulS);

            int jmlJudulS = 0;
            for (buku18 buku : data.listBuku) {
                if (buku != null && buku.judulBuku.equals(cariJudul)) {
                    jmlJudulS++;
                }
            }
            if (jmlJudulS > 1) {
                System.out.println("Peringatan!! Terdapat judul buku yang sama !!");
            }

            System.out.println("Cari data menggunakan binary search");
            int posisiJudulB = data.findJudulBinary(cariJudul);
            data.tampilPosisi(cariJudul, posisiJudulB);
            data.tampilData(cariJudul, posisiJudulB);

            int jmlJudulB = 0;
            for (buku18 buku : data.listBuku) {
                if (buku != null && buku.judulBuku.equals(cariJudul)) {
                    jmlJudulB++;
                }
            }
            if (jmlJudulB > 1) {
                System.out.println("Peringatan!! Terdapat judul buku yang sama !!");
            }
        } else {
            System.out.println("Pilihan tidak valid");
        }
    }
}
