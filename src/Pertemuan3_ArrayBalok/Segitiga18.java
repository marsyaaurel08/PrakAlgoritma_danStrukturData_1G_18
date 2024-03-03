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
    
    public static void main(String[] args) {
        Segitiga18 sgArray[] = new Segitiga18 [4];
        sgArray[0] = new Segitiga18 (10, 4);
        sgArray[1] = new Segitiga18 (20, 10);
        sgArray[2] = new Segitiga18 (15, 6);
        sgArray[3] = new Segitiga18 (25, 10);
        
            for (int i = 0; i < 4; i++) {
                System.out.println("Luas Segitiga ke- "+i+ ": "+ sgArray[i].hitungLuas());
                System.out.println("Keliling Segitiga ke- "+i+": "+ sgArray[i].hitungKeliling());
            }
        }
    }

