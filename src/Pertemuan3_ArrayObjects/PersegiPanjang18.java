package Pertemuan3_ArrayObjects;

public class PersegiPanjang18 {
    public int panjang;
    public int lebar;

    public static void main(String[] args) {
        PersegiPanjang18[] ppArray = new PersegiPanjang18[3];

        ppArray[0] = new PersegiPanjang18();
        ppArray[0].panjang = 110;
        ppArray[0].lebar = 30;

        ppArray[1] = new PersegiPanjang18();
        ppArray[1].panjang = 80;
        ppArray[1].lebar = 40;

        ppArray[2] = new PersegiPanjang18();
        ppArray[2].panjang = 100;
        ppArray[2].lebar = 20;

        System.out.println("Persegi Panjang ke-0, panjang: "+ ppArray[0].panjang +", lebar: "+ ppArray[0].lebar);
        System.out.println("Persegi Panjang ke-1, panjang: "+ ppArray[1].panjang +", lebar: "+ ppArray[1].lebar);
        System.out.println("Persegi Panjang ke-2, panjang: "+ ppArray[2].panjang +", lebar: "+ ppArray[2].lebar);




    }
}

