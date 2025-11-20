// 1366
import java.math.BigInteger;

public class Morales16 {
    public static void main(String[] args) {
        BigInteger x = new BigInteger("2");
        x = x.pow(1000);

        char[] powString = x.toString().toCharArray();
        BigInteger sum = new BigInteger("0");
        for(char digits : powString) {
            BigInteger current = new BigInteger(Character.toString(digits));
            sum = sum.add(current);
        }
        System.out.println(sum);
    }
}
