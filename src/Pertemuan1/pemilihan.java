package Pertemuan1;
import java.util.Scanner;
public class pemilihan {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);
        double nilaiAkhir;
        int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
        
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan nilai tugas : ");
        nilaiTugas = sc18.nextInt();
        if (nilaiTugas < 0 || nilaiTugas > 100) {
            System.out.println("Nilai tidak valid!");
            sc18.close();
            return;
        }

        System.out.print("Masukkan nilai kuis : ");
        nilaiKuis = sc18.nextInt();
        if (nilaiKuis < 0 || nilaiKuis > 100) {
            System.out.println("Nilai tidak valid!");
            sc18.close();
            return;
        }

        System.out.print("Masukkan nilai UTS : ");
        nilaiUTS = sc18.nextInt();
        if (nilaiUTS < 0 || nilaiUTS > 100) {
            System.out.println("Nilai tidak valid!");
            sc18.close();
            return;
        }

        System.out.print("Masukkan nilai UAS : ");
        nilaiUAS = sc18.nextInt();
        if (nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("Nilai tidak valid!");
            sc18.close();
            return;
        }

        nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.3 * nilaiUAS);

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("Nilai akhir : " + nilaiAkhir + "\nNilai huruf : A \nKet : SELAMAT ANDA LULUS");
            System.out.println("==============================");
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("Nilai akhir : " + nilaiAkhir + "\nNilai huruf : B+ \nKet : SELAMAT ANDA LULUS");
            System.out.println("==============================");
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("Nilai akhir : " + nilaiAkhir + "\nNilai huruf : B \nKet : SELAMAT ANDA LULUS");
            System.out.println("==============================");
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("Nilai akhir : " + nilaiAkhir + "\nNilai huruf : C+ \nKet : SELAMAT ANDA LULUS");
            System.out.println("==============================");
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("Nilai akhir : " + nilaiAkhir + "\nNilai huruf : C \nKet : SELAMAT ANDA LULUS");
            System.out.println("==============================");
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("Nilai akhir : " + nilaiAkhir + "\nNilai Huruf : D \nKet : MAAF ANDA TIDAK LULUS");
            System.out.println("==============================");
        } else if (nilaiAkhir <= 39) {
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("Nilai akhir : " + nilaiAkhir + "\nNilai huruf : E \nKet : MAAF ANDA TIDAK LULUS");
            System.out.println("==============================");
        }
        sc18.close();
    }
    
}
