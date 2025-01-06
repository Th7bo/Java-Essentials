package opdrachten.opdracht2;

import java.math.BigInteger;
import java.util.HashMap;

public class Faculteit {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        BigInteger val = getFaculteit(BigInteger.valueOf(5000));
        System.out.println(val);

        long endTime = System.currentTimeMillis();
        System.out.printf("Calculated in: %dms%n", endTime - startTime);
        System.out.println("Cijfers: " + val.toString().length());
    }

    private static BigInteger getFaculteit(BigInteger a) {
        if (a.compareTo(BigInteger.ONE) <= 0) return a;
        BigInteger b = a.subtract(BigInteger.ONE);
        return getFaculteit(b).multiply(a);
    }

}
