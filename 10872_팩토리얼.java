import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        System.out.println(factorial(x));
    }
    public static int factorial(int x) {
        if(x == 0) {
            return 1;
        }
        if (x == 1) {
            x *= 1;
        } else if (x >= 2) {
            x *= factorial(x - 1);
        }
        return x;
    }
}
