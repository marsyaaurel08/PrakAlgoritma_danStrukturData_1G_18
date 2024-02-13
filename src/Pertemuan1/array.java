package Pertemuan1;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);
        
        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");
    
        System.out.print("Masukkan nilai angka MK Pancasila :");
        double nilaiPancasila = sc18.nextDouble();
        System.out.print("masukkan nilai angka MK Konsep Teknologi Informasi :");
        double nilaiKTI = sc18.nextDouble();
        System.out.print("masukkan nilai angka MK Critical Thinking and Problem Solving :");
        double nilaiCTPS = sc18.nextDouble();
        System.out.print("masukkan nilai angka MK Matematika Dasar :");
        double nilaiMatDas = sc18.nextDouble();
        System.out.print("masukkan nilai angka MK Bahasa Inggris :");
        double nilaiBhsInggris = sc18.nextDouble();
        System.out.print("masukkan nilai angka MK Dasar Pemrograman :");
        double nilaiDasPro = sc18.nextDouble();
        System.out.print("masukkan nilai angka MK Praktikum Dasar Pemrograman :");
        double nilaiPrakDasPro = sc18.nextDouble();
        System.out.print("masukkan nilai angka MK Keselamatan dan Kesehatan Kerja :");
        double nilaiK3 = sc18.nextDouble();

        String[] namaMataKuliah = { "Pancasila", "KTI", "CTPS", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Prak. DasPro", "K3" };
        double[] nilaiMataKuliah = { nilaiPancasila, nilaiKTI, nilaiCTPS, nilaiMatDas, nilaiBhsInggris, nilaiDasPro, nilaiPrakDasPro, nilaiK3 };
        String[] konversiIP = new String[8];
        double[] bobotNilai = new double[8];

        for (int i = 0; i < 8; i++) {
            konversiIP[i] = konversiNilai(nilaiMataKuliah[i]);
            bobotNilai[i] = hitungBobot(nilaiMataKuliah[i]);
        }

    
        double ipSemester = hitungIPSemester(bobotNilai);
        System.out.println("===================================================================");
        System.out.println("Hasil Konversi");
        System.out.println("===================================================================");
        System.out.println(" No        MK           Nilai MK   Konversi  Bobot ");
        
        for (int i = 0; i < 8; i++) {
            System.out.printf(" %-2d  %-20s  %-17.2f  %-8s  %-5.2f \n", (i + 1), namaMataKuliah[i], nilaiMataKuliah[i], konversiIP[i], bobotNilai[i]);
        }
        
        System.out.printf("IP Semester: %.2f\n", ipSemester);

        sc18.close();
    }

    public static String konversiNilai (double nilai) {
        if (nilai > 80 && nilai <= 100) {
            return "A";
        } else if (nilai > 73 && nilai <= 80) {
            return "B+";
        } else if (nilai > 65 && nilai <= 73) {
            return "B";
        } else if (nilai > 60 && nilai <= 65 ) {
            return "C+";
        } else if (nilai > 50 && nilai <=60 ) {
            return "C";
        } else if (nilai > 39 && nilai <= 50) {
            return "D";
        } else if (nilai < 39) {
            return "E";
        }  else {
            return "nilai tidak valid";
        }
        
    }

    public static double hitungBobot(double nilai) {
        if (nilai >= 80) {
            return 4.0;
        } else if (nilai >= 75) {
            return 3.7;
        } else if (nilai >= 70) {
            return 3.3;
        } else if (nilai >= 65) {
            return 3.0;
        } else if (nilai >= 60) {
            return 2.7;
        } else if (nilai >= 55) {
            return 2.3;
        } else if (nilai >= 50) {
            return 2.0;
        } else if (nilai >= 45) {
            return 1.5;
        } else {
            return 0.0;
        }
    }

    public static double hitungIPSemester(double[] bobotNilai) {
        double totalBobot = 0;
        for (double bobot : bobotNilai) {
            totalBobot += bobot;
        }
        return totalBobot / bobotNilai.length;
    }
    }

