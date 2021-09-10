import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static long a, b, c;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Long.parseLong((st.nextToken()));
        b = Long.parseLong((st.nextToken()));
        c = Long.parseLong((st.nextToken()));

        System.out.println(pow(a,b));
    }
    public static long pow(long a, long exponent) {
        if(exponent == 1) {
            return a % c;
        }
        long temp = pow(a, exponent / 2);

        if(exponent % 2 == 1) {
            return (temp * temp % c) * a % c;
        }
        return temp * temp % c;
    }
}
