// 4613732
public class Morales2 {

    public static void main(String[] args) {
        int x = 10;

        getFibNums();

        System.out.println();

    }

    public static void getFibNums() {
        long n = 4000000; 
        long total = 0;
        long firstTerm = 0, secondTerm = 1;

        for (long i = 2; i <= n; i++) {
            long nextTerm = firstTerm + secondTerm;
            if (nextTerm % 2 == 0 && nextTerm <= 4000000) {
                total += nextTerm;
            } else if (nextTerm > 4000000) {
                break;
            }
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }
        System.out.println(total);
    }

}
