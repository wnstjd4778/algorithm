import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong((st.nextToken()));
        long m = Long.parseLong((st.nextToken()));

        long count5 = five(n) - five(n - m) - five(m); // nCm = n! / ((n-m)! * m!)이기 때문
        long count2 = two(n) - two(n - m) - two(m);
        System.out.println(Math.min(count2, count5));
    }
    // 5의 승수를 구함
    public static long five(long num) {
        int count = 0;
        while (num >=5) {
            count += (num/5);
            num /= 5;
        }
        return count;
    }
    // 2의 승수를 구함
    public static long two(long num) {
        int count = 0;
        while (num >=2) {
            count += (num/2);
            num /= 2;
        }
        return count;
    }
}
