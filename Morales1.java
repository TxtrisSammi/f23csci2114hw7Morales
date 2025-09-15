// 233168
public class Morales1 {
    public static void main(String[] args) {
        // double time = System.nanoTime();
        System.out.println(twoLoop());
        // time = System.nanoTime() - time;
        // System.out.println("Compile in: " + time);
        
    }

    public static int twoLoop() {
        int sum = 0;
        for (int i = 3; i < 1000; i += 3) {
            sum += i;
        }
        for (int i = 5; i < 1000; i += 5) {
            sum += i;
        }
        return sum;
    }

    // public static int oneLoop() {
    //     int sum = 0;
    //     for (int i = 0; i < 1000; i ++) {
    //         if (i % 3 == 0 || i % 5 == 0) {
    //             sum += i;
    //         }
    //     }
    //     return sum;
    // }
}
