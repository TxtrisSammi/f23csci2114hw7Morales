// 837799
public class Morales14 {
    public static void main(String[] args) {
        long max = 0;
        long maxCount = 0;
        for (long i = 2; i < 1000000; i++) {
            long counter = 1;
            long n = i;
            while (n != 1) {
                if (n % 2 == 0)
                    n /= 2;
                else
                    n = (n * 3) + 1;
                counter ++;
            }
            if (counter >= maxCount) {
                maxCount = counter;
                max = i;
            }
        }
        System.out.println(max);
    }
}
