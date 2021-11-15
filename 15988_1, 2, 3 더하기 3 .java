import java.io.*;
import java.util.*;

public class Main {
    static int MOD = 1000000009;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        long[] dp = new long[1000001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i = 4; i <= 1000000; i++) {
            dp[i] = (long)dp[i - 1] + dp[i - 2] + dp[i - 3];
            dp[i] %= MOD;
        }
        while (tc -- > 0) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(dp[n]);
        }
    }
}
