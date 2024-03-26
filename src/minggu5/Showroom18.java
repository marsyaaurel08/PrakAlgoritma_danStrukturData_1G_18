package minggu5;
public class Showroom18 {
    static class Car {
        String merk;
        String tipe;
        int tahun;
        int top_acceleration;
        int top_power;
        public Car(String merk, String tipe, int tahun, int top_acceleration, int top_power) {
            this.merk = merk;
            this.tipe = tipe;
            this.tahun = tahun;
            this.top_acceleration = top_acceleration;
            this.top_power = top_power;
        }
    }
    public static int maxAcceleration(Car[] cars, int l, int r) {
        if (l == r) {
            return cars[l].top_acceleration;
        }
        int mid = (l + r) / 2;
        int maxLeft = maxAcceleration(cars, l, mid);
        int maxRight = maxAcceleration(cars, mid + 1, r);
        return Math.max(maxLeft, maxRight);
    }
    public static int minAcceleration(Car[] cars, int l, int r) {
        if (l == r) {
            return cars[l].top_acceleration;
        }
        int mid = (l + r) / 2;
        int minLeft = minAcceleration(cars, l, mid);
        int minRight = minAcceleration(cars, mid + 1, r);
        return Math.min(minLeft, minRight);
    }
    public static double averagePower(Car[] cars) {
        double totalPower = 0;
        for (Car car : cars) {
            totalPower += car.top_power;
        }
        return totalPower / cars.length;
    }
}

