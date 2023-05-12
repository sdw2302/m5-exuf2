package martin.suma;

public class Suma {
    private int num1;
    private int num2;

    public int sumar() {
        return num1 + num2;
    }

    public int getNum1() {
        return num1;
    }

    public int sumaValorAbsolut() {
        int x, y;
        if (num1 < 0)
            x = -num1;
        else
            x = num1;
        if (num2 < 0)
            y = -num2;
        else
            y = num2;
        return x + y;
    }
}