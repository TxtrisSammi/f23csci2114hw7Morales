// 137846528820
import java.math.BigInteger;

public class Morales15 {
    public static void main(String[] args) {
        BigInteger n = new BigInteger("20"); // Grid size of n x n

        BigInteger routes = factorial(n.multiply(BigInteger.TWO)).divide(factorial(n).pow(2));
        System.out.println(routes);
    }

    public static BigInteger factorial(BigInteger n) {
        return (n.compareTo(BigInteger.ONE) == 0 || n.compareTo(BigInteger.ZERO) == 0)
                ? BigInteger.ONE : n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
}
