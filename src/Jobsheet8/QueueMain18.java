package Jobsheet8;

import java.util.Scanner;

public class QueueMain18 {
    public static void menu() {
        System.out.println("Masukkan Operasi yang diinginkan: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        Scanner sc18 = new Scanner (System.in);
        int pilih;
        System.out.print("Masukkan Kapasitas queue: ");
        int n = sc18.nextInt();
        Queue18 Q = new Queue18(n);
        

        do{
            menu();
            pilih = sc18.nextInt();
            switch (pilih){
                case 1: 
                System.out.println("Masukkan data baru : ");
                int dataMasuk = sc18.nextInt();
                Q.Enqueue(dataMasuk);
                break;
                case 2:
                int dataKeluar = Q.Dequeue();
                if(dataKeluar !=0){
                    System.out.println("Data yang dikeluarkan: "+ dataKeluar);
                    break;
                }
                case 3:
                Q.print();
                break;
                case 4:
                Q.peek();
                break;
                case 5:
                Q.clear();
                break; 

            }
        } while (pilih ==1 || pilih ==2 || pilih ==3 || pilih ==4 || pilih ==5);
    }
}
