import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[3][n];
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 3; j++) {
                arr[j][i] = Integer.parseInt(st.nextToken());
            }
        }
        int[][] dp = new int[3][n];
        int ans = Integer.MAX_VALUE;
        for(int k = 0; k < 3; k++) {
            for(int i = 0; i < 3; i++) {
                if(i == k) {
                    dp[i][0] = arr[i][0];
                } else {
                    dp[i][0] = 1000000;
                }
            }

            for(int i = 1; i < n; i++) {
                dp[0][i] = Math.min(dp[1][i - 1], dp[2][i - 1]) + arr[0][i];
                dp[1][i] = Math.min(dp[0][i - 1], dp[2][i - 1]) + arr[1][i];
                dp[2][i] = Math.min(dp[0][i - 1], dp[1][i - 1]) + arr[2][i];
            }
            for(int i = 0; i < 3; i++) {
                if(i != k) {
                    ans = Math.min(ans, dp[i][n - 1]);
                }
            }
        }
        System.out.println(ans);
    }
}
