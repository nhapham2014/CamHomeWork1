package camjava;

import org.junit.Assert;
import org.junit.Test;

public class Bai1 {
    public boolean CheckUocSoChung(int so1, int so2) {
        int uocchung = 1;
        boolean ketqua = so1 % uocchung == 0 && so2 % uocchung == 0;
        // boolean ketqua = so1 % uocchung == 0 && so2 % uocchung == 0;
        for (int i = 1; i <= so1 && i <= so2; i++) {

            if (ketqua = so1 % i == 0 && so2 % i == 0) {
                uocchung = i;
                return true;
            }
        }
        return false;
    }
    @Test
    public void Test_CheckUocSoChung(){
        int so1 =10, so2=7;
        boolean expect = true;
        boolean actual = CheckUocSoChung(so1,so2);
        Assert.assertEquals(expect, actual);

    }
}