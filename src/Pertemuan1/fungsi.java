package Pertemuan1;
import java.util.Scanner;
public class fungsi {
    
    static int aglonema = 75000;
    static int keladi = 50000;
    static int alocasia = 60000;
    static int mawar = 10000;

    static int hitungPendapatan(int[] stockBunga) {
        int totalPendapatan = 0;
        totalPendapatan += stockBunga[0] * aglonema;
        totalPendapatan += stockBunga[1] * keladi;
        totalPendapatan += stockBunga[2] * alocasia;
        totalPendapatan += stockBunga[3] * mawar;
        return totalPendapatan;
    }
    static void penguranganStock(int[] stock, int aglonema, int keladi, int alocasia, int mawar) {
        stock[0] -= aglonema;
        stock[1] -= keladi;
        stock[2] -= alocasia;
        stock[3] -= mawar;
    }



    public static void main(String[] args) {
        
        int[][] Bunga = {
                { 10, 5, 15, 7 }, 
                { 6, 11, 9, 12 }, 
                { 2, 10, 10, 5 }, 
                { 5, 7, 12, 9 } 
        };

        
        System.out.println("Pendapatan setiap cabang :");
        for (int i = 0; i < Bunga.length; i++) {
            int pendapatan = hitungPendapatan(Bunga[i]);
            System.out.println("RoyalGarden " + (i + 1) + ": " + pendapatan);
        }

        
        System.out.println("\nJumlah stock bunga :");
        int cabang = 4; 
        System.out.println("Aglonema: " + Bunga[cabang - 1][0]);
        System.out.println("Keladi: " + Bunga[cabang - 1][1]);
        System.out.println("Alocasia: " + Bunga[cabang - 1][2]);
        System.out.println("Mawar: " + Bunga[cabang - 1][3]);
        penguranganStock(Bunga[cabang - 1], 1, 2, 0, 5);

        System.out.println("\nJumlah stock bunga setelah pengurangan:");
        System.out.println("Aglonema: " + Bunga[cabang - 1][0]);
        System.out.println("Keladi: " + Bunga[cabang - 1][1]);
        System.out.println("Alocasia: " + Bunga[cabang - 1][2]);
        System.out.println("Mawar: " + Bunga[cabang - 1][3]);
    }

    
    }

