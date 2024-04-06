package Pertemuan7_Jobsheet6;

public class PencarianBuku18 {
    buku18[] listBuku = new buku18[5];
    private int idx = 0;

    public void tambah(buku18 m) {
        if (idx < listBuku.length) {
            listBuku[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    public void tampil() {
        for (buku18 m : listBuku) {
            if (m != null) {
                m.tampilDataBuku(); 
            }
        }
    }

    public int findSeqSearch(String cari) {
        for (int j = 0; j < listBuku.length; j++) {
            if (listBuku[j] != null && String.valueOf(listBuku[j].kodeBuku).equals(cari)) {
                return j;
            }
        }
        return -1;
    }

    public int findBinarySearch(String cari, int left, int right) {
        while (right >= left) {
            int mid = left + (right - left) / 2;
            if (listBuku[mid] != null && String.valueOf(listBuku[mid].kodeBuku).equals(cari)) {
                return mid;
            } else if (listBuku[mid] != null && String.valueOf(listBuku[mid].kodeBuku).compareTo(cari) < 0) {
                
                right = mid - 1;
            } else {
               
                left = mid + 1;
            }
        }
        return -1;
    }
    

    public void tampilPosisi(String x, int pos) { 
        if (pos != -1) {
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public void tampilData(String x, int pos) { 
        if (pos != -1 && listBuku[pos] != null) {
            System.out.println("Kode Buku\t : " + x);
            System.out.println("Judul\t\t :" + listBuku[pos].judulBuku);
            System.out.println("Tahun Terbit\t :" + listBuku[pos].tahunTerbit);
            System.out.println("Pengarang\t :" + listBuku[pos].pengarang);
            System.out.println("Stock\t\t :" + listBuku[pos].stock);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public buku18 findBuku(String cari) {
        int posisi = findSeqSearch(cari);
        if (posisi != -1) {
            return listBuku[posisi];
        }
        return null;
    }

    public int findJudulSequential(String judul) {
        for (int j = 0; j < listBuku.length; j++) {
            if (listBuku[j] != null && listBuku[j].judulBuku.equals(judul)) {
                return j;
            }
        }
        return -1;
    }

    public void bubbleSort() {
        for (int i = 0; i < listBuku.length - 1; i++) {
            for (int j = 0; j < listBuku.length - i - 1; j++) {
                if (listBuku[j] != null && listBuku[j + 1] != null && listBuku[j].judulBuku.compareTo(listBuku[j + 1].judulBuku) > 0) {
                    buku18 tmp = listBuku[j];
                    listBuku[j] = listBuku[j + 1];
                    listBuku[j + 1] = tmp;
                }
            }
        }
    }

    public int findJudulBinary(String judul) {
        bubbleSort();
        int left = 0;
        int right = listBuku.length - 1;

        while (right >= left) {
            int mid = left + (right - left) / 2;
            if (listBuku[mid] != null) {
                int compare = listBuku[mid].judulBuku.compareTo(judul);
                if (compare == 0) {
                    return mid;
                } else if (compare > 0) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}