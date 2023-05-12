package martin.suma;

import org.junit.Test;
import static org.junit.Assert.*;

public class Suma {
    @Test
    public void sumarTest() {
        int x = 5, y = -3;
        int exp = 2;
        Suma test = new Suma(x, y);
        res = test.sumar();
        assertEquals(exp, res);
    }
}