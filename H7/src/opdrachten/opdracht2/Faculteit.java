package opdrachten.opdracht2;

import java.math.BigInteger;
import java.util.HashMap;

public class Faculteit {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(getFaculteit(BigInteger.valueOf(5000)));
        long endTime = System.currentTimeMillis();
        System.out.printf("Calculated in: %dms%n", endTime - startTime);
    }

    private static final HashMap<BigInteger, BigInteger> cached = new HashMap<>();

    private static BigInteger getFaculteit(BigInteger a) {
        if (a.compareTo(BigInteger.ONE) <= 0) return a;
        BigInteger b = a.subtract(BigInteger.ONE);
        if (cached.containsKey(b)) return cached.get(b);
        BigInteger value = getFaculteit(b).multiply(a);
        cached.put(b, value);
        return value;
    }

}
