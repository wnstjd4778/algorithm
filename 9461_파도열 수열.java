import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        while (size-- > 0) {
            int num = Integer.parseInt(br.readLine());
            long[] dp = new long[101];
            dp[1] = 1;
            dp[2] = 1;
            dp[3] = 1;
            dp[4] = 2;
            dp[5] = 2;
            for(int i = 6; i <= num; i++) {
                dp[i] = dp[i - 1] + dp[i - 5];
            }
            System.out.println(dp[num]);
        }
    }
}
