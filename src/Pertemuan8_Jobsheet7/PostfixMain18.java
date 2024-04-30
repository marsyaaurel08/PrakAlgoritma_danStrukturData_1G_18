package Pertemuan8_Jobsheet7;
import java.util.Scanner;
public class PostfixMain18 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan Ekspresi Matematika (infix): ");
        Q = sc18.nextLine();
        Q = Q.trim();
        Q = "("+Q+")";

        int total = Q.length();
        Postfix18 post = new Postfix18 (total);
        P = post.konversi(Q);
        System.out.println("Postfix: "+P);
    }
}
