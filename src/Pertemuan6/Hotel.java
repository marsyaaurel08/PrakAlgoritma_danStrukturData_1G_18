package Pertemuan6;
public class Hotel {
    String nama;
    String kota;
    int harga;
    byte bintang;
    Hotel(String nama, String kota, int harga, byte bintang) {
        this.nama = nama;
        this.kota = kota;
        this.harga = harga;
        this.bintang = bintang;
    }
    void tampil() {
        System.out.println("Nama Hotel: " + nama);
        System.out.println("Kota: " + kota);
        System.out.println("Harga: " + harga);
        System.out.println("Bintang: " + bintang);
        System.out.println("------------------");
    }
    int getHarga() {
        return harga;
    }
    byte getBintang() {
        return bintang;
    }
}

