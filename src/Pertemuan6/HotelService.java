package Pertemuan6;
import java.util.Arrays;
public class HotelService {
    Hotel[] rooms;
    int idx;
    public HotelService(int capacity) {
        this.rooms = new Hotel[capacity];
        this.idx = 0;
    }
    void tambahHotel(Hotel hotel) {
        if (idx < rooms.length) {
            rooms[idx] = hotel;
            idx++;
        } else {
            System.out.println("Kapasitas penuh, tidak bisa menambah hotel lagi.");
        }
    }
    void tampilAll() {
        for (Hotel hotel : rooms) {
            if (hotel != null) {
                hotel.tampil();
            }
        }
    }
    void bubbleSortByPrice() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (rooms[j].getHarga() > rooms[j + 1].getHarga()) {
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = temp;
                }
            }
        }
    }
    void selectionSortByRating() {
        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (rooms[j].getBintang() > rooms[idxMax].getBintang()) {
                    idxMax = j;
                }
            }
            Hotel temp = rooms[idxMax];
            rooms[idxMax] = rooms[i];
            rooms[i] = temp;
        }
    }
}
