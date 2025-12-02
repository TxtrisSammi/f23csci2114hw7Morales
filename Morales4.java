// 906609
public class Morales4 {
    public static void main(String[] args) {
        int bigPal = 0;
        for (int i = 999; i > 0; i--) {
            for (int j = 999; j > 0; j--) {
                int product = i * j;
                if (isPalindrome(product) && product > bigPal) {
                    bigPal = product;
                }
            }
        }
        System.out.println(bigPal);
    }

    public static boolean isPalindrome(int num) {
        boolean p = true;
        char[] array = String.valueOf(num).toCharArray();
        int endIndex = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[endIndex]) {
                p = false;
                break;
            }
            endIndex --;
        }
        return p;
    }
}
