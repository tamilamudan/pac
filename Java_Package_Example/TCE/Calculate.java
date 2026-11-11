package TCE;

public class Calculate {
    private int a, b, c;
    public int sum, product;

    public void set(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    public void calculate() {
        sum = a + b + c;
        product = a * b * c;
    }
}
