// 648
import java.math.BigInteger;

public class Morales20 {
    public static void main(String[] args) {
        BigInteger result = factorial("100");
        char[] factString = result.toString().toCharArray();
        int sum = 0;
        for (char digit : factString) {
            sum += Integer.valueOf(String.valueOf(digit));
        }
        System.out.println(sum);
    }

    public static BigInteger factorial(String num) {
        BigInteger result = new BigInteger(num);
        for (int i = Integer.parseInt(num) - 1; i > 0; i--) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}
