import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] dp = new int[n + 1][m + 1];
        int max = 0;
        for(int i = 1; i <= n; i++) {
            String str = br.readLine();
            for(int j = 1; j <= m; j++) {
                dp[i][j] = str.charAt(j - 1) - '0';
                if(dp[i][j] == 0) {
                    continue;
                }
                dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]) + 1;
                max = Math.max(max, dp[i][j]);
            }
        }
        System.out.println(max * max);
    }
}
