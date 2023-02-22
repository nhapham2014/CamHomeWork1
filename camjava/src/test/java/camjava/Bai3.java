package camjava;

import org.junit.Assert;
import org.junit.Test;

public class Bai3 {
    public void LietKeSo(int number) {
        for (int i = 0; i <= number / 2; i++) {
            for (int j = number; j >= i; j--) {
                if (i + j == number) {
                    System.out.println("số 1 = " + i + ", số 2 = " + j);

                }
            }
        }
    }

    @Test
    public void Test_LietKeSo() {
        int number = 100;
        LietKeSo(number);
    }
}
