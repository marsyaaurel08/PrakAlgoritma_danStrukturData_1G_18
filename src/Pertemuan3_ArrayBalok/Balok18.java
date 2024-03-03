package Pertemuan3_ArrayBalok;

public class Balok18 {
    public int panjang;
    public int lebar ;
    public int tinggi;

    public Balok18 (int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    public int hitungVolume() {
        return panjang*lebar*tinggi;
    }
    public static void main(String[] args) {
        Balok18 blArray[] = new Balok18 [3];
        blArray[0] = new Balok18(100, 30,12);
        blArray[1] = new Balok18(120, 40,15);
        blArray[2] = new Balok18(210, 50,25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume Balok ke- "+i+ ": "+ blArray[i].hitungVolume());
        }
    }
}
