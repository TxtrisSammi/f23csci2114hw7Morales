// 76576500
// 576 factors
public class Morales12 {

    public static void main(String[] args) {
        int triNum = 1;
        int triNext = 1;
        int triNumFacs = 0;
        while (triNumFacs <= 500) {
            triNext++;
            triNum += triNext;
            triNumFacs = 0;

            // String facString = "";
            for (int i = 1; i * i <= triNum; i++) {

                if (triNum % i == 0) {
                    // facString += i + ",";
                    triNumFacs += 2;
                }
                // System.out.println(triNum);

            }

            // System.out.println(facString);
        }
        System.out.println(triNum);
        // System.out.println(triNumFacs);
    }

}
