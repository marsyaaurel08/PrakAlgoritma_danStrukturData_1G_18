package Pertemuan2;

public class BukuMain18 {
    public static void main(String[] args) {
        
    
        Buku18 bk1 = new Buku18();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.hitungHargaTotal(0);
        bk1.hitungDiskon(0);
        bk1.hitungHargaBayar(0);

        Buku18 bk2 = new Buku18("Self Reward","Maheera Ayesha",160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku18 bk3 = new Buku18("Marsya", "Marsya Aurelia S",190, 19, 80000);
        bk3.tampilInformasi();



    }
}
