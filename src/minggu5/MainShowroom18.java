package minggu5;
import java.util.Arrays;
public class MainShowroom18 {
    public static void main(String[] args) {
        Showroom18.Car[] cars = {
                new Showroom18.Car("BMW", "M2 Coupe", 2016, 6816, 728),
                new Showroom18.Car("Ford", "Fiesta ST", 2014, 3921, 575),
                new Showroom18.Car("Nissan", "370Z", 2009, 4360, 657),
                new Showroom18.Car("Subaru", "BRZ", 2014, 4058, 609),
                new Showroom18.Car("Subaru", "Impreza WRX STI", 2013, 6255, 703),
                new Showroom18.Car("Toyota", "AE86 Trueno", 1986, 3700, 553),
                new Showroom18.Car("Toyota", "86/GT86", 2014, 4180, 609),
                new Showroom18.Car("Volkswagen", "Golf GTI", 2014, 4180, 631)
        };

        int maxAcc = Showroom18.maxAcceleration(cars, 0, cars.length - 1);
        int minAcc = Showroom18.minAcceleration(cars, 0, cars.length - 1);
        double avgPower = Showroom18.averagePower(cars);

        System.out.println("a) Top Acceleration Tertinggi: " + maxAcc);
        System.out.println("b) Top Acceleration Terendah: " + minAcc);
        System.out.println("c) Rata-rata Top Power dari Seluruh Mobil: " + avgPower);
    }
}

