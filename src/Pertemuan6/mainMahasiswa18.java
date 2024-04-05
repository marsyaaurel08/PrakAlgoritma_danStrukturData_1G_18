package Pertemuan6;

public class mainMahasiswa18 {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa18 m1 = new Mahasiswa18 ("Nusa", 2017, 25, 3 );
        Mahasiswa18 m2 = new Mahasiswa18 ("Rara", 2012, 19, 4 );
        Mahasiswa18 m3 = new Mahasiswa18 ("Dompu", 2018, 19, 3.5 );
        Mahasiswa18 m4 = new Mahasiswa18 ("Abdul", 2017, 23, 2 );
        Mahasiswa18 m5 = new Mahasiswa18 ("Ummi", 2019, 21, 3.75 );

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting asc berdasarkan ipk");
        list.selectionSort();
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting desc berdasarkan ipk");
        list.insertionSort();
        list.tampil();
    }
}
