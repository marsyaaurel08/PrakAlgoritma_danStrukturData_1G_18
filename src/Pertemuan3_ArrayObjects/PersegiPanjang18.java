package Pertemuan3_ArrayObjects;

import java.util.Scanner;

public class PersegiPanjang18 {
    public int panjang;
    public int lebar;

    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);

        System.out.print("Masukkan jumlah Persegi Panjang: ");
        int length = sc18.nextInt();

        PersegiPanjang18[] ppArray = new PersegiPanjang18[length];

        for (int i = 0; i < length; i++) {
            ppArray[i] = new PersegiPanjang18();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.print("Masukkan Panjang: ");
            ppArray[i].panjang = sc18.nextInt();
            System.out.print("Masukkan Lebar: ");
            ppArray[i].lebar = sc18.nextInt();

        }
        for (int i = 0; i < length; i++) {
            System.out.println("Persegi Panjang Ke- " + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
    }
}
