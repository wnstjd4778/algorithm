import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[][] map;
    static long[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        map = new int[101][101];
        for(int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dp = new long[101][101];
        dp[1][1] = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                int num = map[i][j];
                if(num == 0) break;
                if (i + num <= n) {
                    dp[i + num][j] += dp[i][j];
                }
                if (j + num <= n) {
                    dp[i][j + num] += dp[i][j];
                }
            }
        }
        System.out.println(dp[n][n]);
    }
}
