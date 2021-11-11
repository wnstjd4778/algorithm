import java.io.*;
import java.util.*;

public class Main {
    static int m;
    static final int MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        m = Integer.parseInt(br.readLine());
        long answer = 0;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            answer = (answer + fraction(s, n)) % MOD;
        }
        System.out.println(answer);
    }

    static long inverse(long b, int n) {
        long result = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                result = result * b % MOD;
            }
            b = b * b % MOD;
            n >>= 1;
        }
        return result;
    }

    static long fraction(long a, long b) {
        return a * inverse(b, MOD-2) % MOD;
    }
}
