// 104743
import java.util.ArrayList;

public class Morales7 {
    public static void main(String[] args) {
        int count = 1;
        ArrayList<Integer> array = new ArrayList<>();
        array.add(2);
        for (int i = 3; count < 10001; i++) {
            boolean primality = true;
            for (int prime : array) {
                primality = !(i % prime == 0);
                if (!primality)
                break;
            } 
            if (primality) {
                array.add(i);
                count ++;
            }
        }   
        System.out.println(array.getLast());
    }
}
