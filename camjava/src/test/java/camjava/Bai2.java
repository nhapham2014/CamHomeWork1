package camjava;

import org.junit.Assert;
import org.junit.Test;

public class Bai2 {
    public boolean CheckSoNguyenTo(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;
    }
@Test
public void Test_CheckSoNguyenTo()
{
    int number=4;
    boolean expect=true;
    boolean actual=CheckSoNguyenTo(number);
    Assert.assertEquals(expect,actual);
}

}
