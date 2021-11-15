import java.io.*;
import java.util.*;

public class Main {
    static int n, m, k;
    static int checkX, checkY;
    static int[][] dp = new int[16][16];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        if(k == 0) {
            k++;
        }
        dp[1][1] = 1;
        checkPoint();
        startMap();
        System.out.println(dp[n][m]);
    }
    static void checkPoint() {
        if(k % m == 0) {
            checkX = (k / m);
            checkY = m;
        } else {
            checkX = k / m + 1;
            checkY = (k % m);
        }
    }

    static void startMap() {
        for(int i = 1; i <= checkX; i++) {
            for(int j = 1; j <= checkY; j++) {
                if(i == 1 && j == 1) {
                    continue;
                }
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        for(int i = checkX; i <= n; i++) {
            for(int j = checkY; j <= m; j++) {
                if(i == checkX && j == checkY) {
                    continue;
                }
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
    }
}
