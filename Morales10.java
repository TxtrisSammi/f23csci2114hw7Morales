// 142913828922
public class Morales10 {
    public static void main(String[] args) {
        int n = 2000000;
            boolean[] places = new boolean[n];
            for (int i = 2; i < Math.sqrt(places.length); i++) {
                for (int j = i + i; j < places.length; j+= i) {
                    if (j % i == 0) {
                        places[j] = true;
                    }
                }
            }
            
            long count = 0;
            for (int i = 2; i < places.length; i++) {
                if (!places[i]) {
                    count += i;
                }
            }
            System.out.println(count);
    }
}
