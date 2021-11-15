import java.io.*;
import java.util.*;

public class Main {
    static int n, m, ans;
    static int[][] map, dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n + 1][m + 1];
        dp = new int[n + 1][m + 1];
        for(int i = 1; i <= n; i++) {
            String str = br.readLine();
            for(int j = 1; j <= m; j++) {
                dp[i][j] = map[i][j] = str.charAt(j - 1) - '0';
            }
        }
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if(map[i][j] == 1) {
                    dp[i][j] = check(i, j);
                    ans = Math.max(ans, dp[i][j]);
                }
            }
        }
        System.out.println(ans * ans);
    }

    static int check(int x, int y) {
        int check1 = dp[x - 1][y - 1];
        int check2 = dp[x][y - 1];
        int check3 = dp[x - 1][y];
        if(check1 == 0 || check2 == 0 || check3 == 0) {
            return 1;
        }
        return Math.min(Math.min(check1, check2), check3) + 1;
    }
}
