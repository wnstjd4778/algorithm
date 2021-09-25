import java.io.*;
import java.util.*;


public class Main {
    static int n;
    static int[][] dp;
    static int[][] cost;
    static int INF = 1000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dp = new int[n][3];
        cost = new int[n][3];
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            cost[i][0] = Integer.parseInt(st.nextToken());
            cost[i][1] = Integer.parseInt(st.nextToken());
            cost[i][2] = Integer.parseInt(st.nextToken());
        }
        dp[0][0] = cost[0][0];
        dp[0][1] = cost[0][1];
        dp[0][2] = cost[0][2];
        for(int i = 1; i < n; i++) {
            int num1 = Math.max(dp[i - 1][0] + cost[i][0], dp[i - 1][1] + cost[i][0]);
            int num2 = Math.max(Math.max(dp[i - 1][0] + cost[i][1], dp[i - 1][1] + cost[i][1]), dp[i -1][2] + cost[i][1]);
            int num3 = Math.max(dp[i - 1][1] + cost[i][2], dp[i - 1][2] + cost[i][2]);
            dp[i][0] = num1;
            dp[i][1] = num2;
            dp[i][2] = num3;
        }
        System.out.println(Math.max(Math.max(dp[n - 1][0], dp[n - 1][1]), dp[n - 1][2]));
        dp = new int[n][3];
        for(int i = 0; i < n; i++) {
            Arrays.fill(dp[i], INF);
        }
        dp[0][0] = cost[0][0];
        dp[0][1] = cost[0][1];
        dp[0][2] = cost[0][2];
        for(int i = 1; i < n; i++) {
            int num1 = Math.min(dp[i - 1][0] + cost[i][0], dp[i - 1][1] + cost[i][0]);
            int num2 = Math.min(Math.min(dp[i - 1][0] + cost[i][1], dp[i - 1][1] + cost[i][1]), dp[i -1][2] + cost[i][1]);
            int num3 = Math.min(dp[i - 1][1] + cost[i][2], dp[i - 1][2] + cost[i][2]);
            dp[i][0] = num1;
            dp[i][1] = num2;
            dp[i][2] = num3;
        }
        System.out.println(Math.min(Math.min(dp[n - 1][0], dp[n - 1][1]), dp[n - 1][2]));
    }
}
