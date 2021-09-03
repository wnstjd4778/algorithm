import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] c = new int[3];
        int[] d = new int[3];
        int result1 = 0;
        int result2 = 0;
        int result = 0;
        for (int i = 0; i < 3; i++) {
            c[i] = a % 10;
            a /= 10;
        }
        for (int i = 2, j = 0; i >= 0; i--, j++) {
            result1 += (int)(Math.pow((double) 10, (double) i)*c[j]);
        }
        for (int r = 0; r < 3; r++) {
            d[r] = b % 10;
            b /= 10;
        }
        for (int i = 2, j = 0; i >= 0; i--, j++) {
            result2 += (int)(Math.pow((double) 10, (double) i)*d[j]);
        }
        result = Math.max(result1, result2);
        System.out.println(result);


    }
}
