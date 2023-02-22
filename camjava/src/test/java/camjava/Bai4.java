package camjava;

import org.junit.Test;

public class Bai4 {
    public void TongSoNguyen(int number) {
        int tong = 0;
        for (int i = 0; i <= number - 1; i++) {
            tong = tong + i;
            if (i == number - 1) {
                System.out.println(tong);
            }
        }
    }

    @Test
    public void Test_TongSoNguyen() {
        int number = 15;
        TongSoNguyen(number);
    }
}
