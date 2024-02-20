package Pertemuan2;

public class Buku18 {

    String judul, pengarang;
    int halaman, stok, harga;

    public Buku18() {

    }

    public Buku18(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
            System.out.println("Jumlah Buku Terjual: "+ jml);
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    void hitungHargaTotal(int total) {
        int hargaTotal = harga * stok;
        System.out.println("Harga total: Rp " + hargaTotal);
    }

    void hitungDiskon(int dis) {
        int hargaTotal = harga * stok;
        double diskon = 0.0;

        if (hargaTotal > 150000) {
            diskon = 0.12;
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            diskon = 0.05;
        }

        double totalDiskon = hargaTotal * diskon;
        System.out.println("Diskon: " + (diskon * 100) + "%");
    }

    void hitungHargaBayar(int bayar) {
        int hargaTotal = harga * stok;
        double diskon = 0.0;

        if (hargaTotal > 150000) {
            diskon = 0.12;
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            diskon = 0.05;
        }

        double totalDiskon = hargaTotal * diskon;
        double hargaBayar = hargaTotal - totalDiskon;
        System.out.println("Harga bayar setelah diskon: Rp " + hargaBayar);
    }
}
