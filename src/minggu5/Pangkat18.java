package minggu5;

public class Pangkat18 {
    public int nilai, pangkat;

    public int pangkatBF(int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil *= a;
        }
        return hasil;
    }

    public int pangkatDC(int a, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 1) {
            return a * pangkatDC(a, n - 1);
        } else {
            int temp = pangkatDC(a, n / 2);
            return temp * temp;
        }
    }
}

