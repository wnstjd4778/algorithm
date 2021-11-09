import java.io.*;
import java.util.*;

public class Main {

    static long MOD = 1000000007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        if(n == 1 || n == 0) {
            System.out.println(n);
            return;
        }
        n--;
        long[][] origin = {{1,1}, {1, 0}};
        long[][] a = {{1, 0}, {0, 1}};
        while (n > 0) {
            if(n % 2 == 1) {
                a = multiply(a, origin);
            }
            origin = multiply(origin, origin);
            n /= 2;
        }
        System.out.println(a[0][0]);
    }
    static long[][] multiply(long[][] o1, long[][] o2) {
        long[][] ret = new long[2][2];
        ret[0][0] = ((o1[0][0] * o2[0][0]) + (o1[0][1] * o2[1][0])) % MOD;
        ret[0][1] = ((o1[0][0] * o2[0][1]) + (o1[0][1] * o2[1][1])) % MOD;
        ret[1][0] = ((o1[1][0] * o2[0][0]) + (o1[1][1] * o2[1][0])) % MOD;
        ret[1][1] = ((o1[1][0] * o2[0][1]) + (o1[1][1] * o2[1][1])) % MOD;
        return ret;
    }
}
