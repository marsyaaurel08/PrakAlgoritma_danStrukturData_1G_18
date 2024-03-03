package Pertemuan3_LatPraktikum;
import java.util.Scanner;
public class sistemakademik18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[3];
        
        for (int i = 0; i < daftarMahasiswa.length; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Masukkan Jenis Kelamin (L/P): ");
            char jenisKelamin = scanner.next().charAt(0);
            System.out.print("Masukkan IPK: ");
            double ipk = scanner.nextDouble();
            scanner.nextLine();
            daftarMahasiswa[i] = new Mahasiswa(nama, nim, jenisKelamin, ipk);
        }
        System.out.println("\nInformasi Mahasiswa:");
        for (int i = 0; i < daftarMahasiswa.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.println("Nama: " + daftarMahasiswa[i].getNama());
            System.out.println("NIM: " + daftarMahasiswa[i].getNim());
            System.out.println("Jenis Kelamin: " + daftarMahasiswa[i].getJenisKelamin());
            System.out.println("IPK: " + daftarMahasiswa[i].getIpk());
            System.out.println();
        }
        
        scanner.close();
    }
}
class Mahasiswa {
    private String nama;
    private String nim;
    private char jenisKelamin;
    private double ipk;

    public Mahasiswa(String nama, String nim, char jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public double getIpk() {
        return ipk;
    }
}
