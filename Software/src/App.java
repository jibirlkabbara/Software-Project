import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        System.out.println(multiplication(x, y));
    }

    public static int multiplication(int x, int y) {
        int result = 1;
        if (x < y) {
            for (int i = x; i <= y; i++) {
                result *= i;
            }
        } else if (x > y) {
            for (int i = y; i <= x; i++) {
                result *= i;
            }
        } else {
            return x;
        }
        return result;
    }
}
