package IT;

import TCE.Calculate;

public class Main {
    public static void main(String[] args) {
        Calculate obj = new Calculate();

        obj.set(10, 20, 30);
        obj.calculate();

        System.out.println("Sum = " + obj.sum);
        System.out.println("Product = " + obj.product);
    }
}
