package Jobsheet12;

import java.util.Scanner;

public class GraphMain18 {
    public static void main(String[] args) {
        Graph18 gedung = new Graph18(6);
        try {
            gedung.addEdge(0, 1, 50);
            gedung.addEdge(0, 2, 100);
            gedung.addEdge(1, 3, 70);
            gedung.addEdge(2, 3, 40);
            gedung.addEdge(3, 4, 60);
            gedung.addEdge(4, 5, 80);
            
            gedung.degree(0);
            gedung.printGraph();
            
            gedung.removeEdge(1, 3);
            gedung.printGraph();
            
            Scanner sc18 = new Scanner(System.in);
            
            System.out.print("Masukkan gedung asal: ");
            int asal = sc18.nextInt();
            System.out.print("Masukkan gedung tujuan: ");
            int tujuan = sc18.nextInt();
        
            try {
                if (gedung.cekKetetanggan(asal, tujuan)) {
                    System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " bertetangga");
                } else {
                    System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " tidak bertetangga");
                }
            } catch (Exception e) {
                System.err.println("Terjadi kesalahan: " + e.getMessage());
            }
            
            
            sc18.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
