// 4613732
public class Morales2 {
    public static void main(String[] args) {
        long n = 4000000; 
        long total = 0;
        long firstTerm = 0, secondTerm = 1;
        long nextTerm = firstTerm + secondTerm;
        
        while (nextTerm <= n) {
            nextTerm = firstTerm + secondTerm;
            if (nextTerm % 2 == 0 && nextTerm <= n)
                total += nextTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println(total);
    }
}
