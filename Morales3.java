// 6857
public class Morales3 {
    public static void main(String[] args) {
        long n = 600851475143L;
        long bigPrime = 0;
    
        for (long x = 1L; x * x < n; x++) {
            if (n % x == 0 && isPrime((x))) {
                bigPrime = x;
            } 
        }
        System.out.println(bigPrime);
    }

    public static boolean isPrime(long num) {
        boolean primality = true;
        for (long i = 2; i * i < num; i++) {
            if (num % i == 0) {
                primality = false;
            }
        }
        return primality;
    }
}
