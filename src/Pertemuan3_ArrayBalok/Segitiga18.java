package Pertemuan3_ArrayBalok;

public class Segitiga18 {
    public int alas;
    public int tinggi;

    public Segitiga18 (int a, int t){
        alas = a;
        tinggi = t;
    }
    public int hitungLuas(){
        return (alas*tinggi) / 2;
    }
    public int hitungKeliling(){
        int sisiMiring = (int) Math.sqrt((alas * alas) + (tinggi * tinggi));
        return alas + tinggi + sisiMiring;
    }
    
}
