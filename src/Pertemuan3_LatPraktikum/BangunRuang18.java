package Pertemuan3_LatPraktikum;
import java.util.Scanner;
public class BangunRuang18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahBangunRuang = 3;

        for (int i = 0; i < jumlahBangunRuang; i++) {
            System.out.println("Bangun ruang ke-" + (i + 1));
            System.out.println("Pilih jenis bangun ruang (1: Kerucut, 2: Limas Segi Empat Sama Sisi, 3: Bola): ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan jari-jari: ");
                    double jariJariKerucut = scanner.nextDouble();
                    System.out.println("Masukkan sisi miring: ");
                    double sisiMiringKerucut = scanner.nextDouble();
                    Kerucut kerucut = new Kerucut(jariJariKerucut, sisiMiringKerucut);
                    System.out.println("Luas Permukaan: " + kerucut.luasPermukaan());
                    System.out.println("Volume: " + kerucut.volume());
                    break;
                case 2:
                    System.out.println("Masukkan panjang sisi alas: ");
                    double panjangSisiAlasLimas = scanner.nextDouble();
                    System.out.println("Masukkan tinggi limas: ");
                    double tinggiLimas = scanner.nextDouble();
                    LimasSegiEmpatSamaSisi limas = new LimasSegiEmpatSamaSisi(panjangSisiAlasLimas, tinggiLimas);
                    System.out.println("Luas Permukaan: " + limas.luasPermukaan());
                    System.out.println("Volume: " + limas.volume());
                    break;
                case 3:
                    System.out.println("Masukkan jari-jari: ");
                    double jariJariBola = scanner.nextDouble();
                    Bola bola = new Bola(jariJariBola);
                    System.out.println("Luas Permukaan: " + bola.luasPermukaan());
                    System.out.println("Volume: " + bola.volume());
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
    }
}

class Kerucut {
    private double jariJari;
    private double sisiMiring;

    public Kerucut(double jariJari, double sisiMiring) {
        this.jariJari = jariJari;
        this.sisiMiring = sisiMiring;
    }

    public double luasPermukaan() {
        return Math.PI * jariJari * (jariJari + sisiMiring);
    }

    public double volume() {
        return (1.0 / 3) * Math.PI * jariJari * jariJari * sisiMiring;
    }
}

class LimasSegiEmpatSamaSisi {
    private double panjangSisiAlas;
    private double tinggiLimas;

    public LimasSegiEmpatSamaSisi(double panjangSisiAlas, double tinggiLimas) {
        this.panjangSisiAlas = panjangSisiAlas;
        this.tinggiLimas = tinggiLimas;
    }

    public double luasPermukaan() {
        return panjangSisiAlas * panjangSisiAlas + 4 * ((1.0 / 2) * panjangSisiAlas * Math.sqrt((panjangSisiAlas / 2) * (panjangSisiAlas / 2) + tinggiLimas * tinggiLimas));
    }

    public double volume() {
        return (1.0 / 3) * panjangSisiAlas * panjangSisiAlas * tinggiLimas;
    }
}

class Bola {
    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    public double luasPermukaan() {
        return 4 * Math.PI * jariJari * jariJari;
    }

    public double volume() {
        return (4.0 / 3) * Math.PI * jariJari * jariJari * jariJari;
    }
}
