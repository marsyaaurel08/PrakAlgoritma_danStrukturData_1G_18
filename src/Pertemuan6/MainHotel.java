package Pertemuan6;

public class MainHotel {
    public static void main(String[] args) {
        HotelService hotelService = new HotelService(3);

        hotelService.tambahHotel(new Hotel("Hotel Regents Park", "Malang", 500000, (byte) 4));
        hotelService.tambahHotel(new Hotel("Hotel Ibis", "Malang", 300000, (byte) 3));
        hotelService.tambahHotel(new Hotel("Hotel Grand Mercure", "Malang", 700000, (byte) 5));
        

        System.out.println("Daftar Hotel sebelum sorting:");
        hotelService.tampilAll();

        hotelService.bubbleSortByPrice();
        System.out.println("\nDaftar Hotel setelah sorting berdasarkan harga (asc):");
        hotelService.tampilAll();

        hotelService.selectionSortByRating();
        System.out.println("\nDaftar Hotel setelah sorting berdasarkan rating (desc):");
        hotelService.tampilAll();
    }
}

