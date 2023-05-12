package martin.suma;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SumaTest {

    @Test
    public void testSumar() {
        int x = 5, y = -2;
        Suma instance = new Suma(x, y);
        int expResult = 3;
        int result = instance.sumar();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetNum1() {
        int x = 5, y = -2;
        Suma instance = new Suma(x, y);
        int expResult = 5;
        int result = instance.getNum1();
        assertEquals(expResult, result);
    }

    @Test
    public void testSumaValorAbsolut() {
        int x = 5, y = -2;
        Suma instance = new Suma(x, y);
        int expResult = 7;
        int result = instance.sumaValorAbsolut();
        assertEquals(expResult, result);
    }

}
