import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[][] arr;
    static boolean[][] check;
    static int cnt = 0;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dp = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                cnt = Math.max(cnt, dfs(i, j));
            }
        }
        System.out.println(cnt);
    }

    static int dfs(int x, int y) {
        if(dp[x][y] != 0) {
            return dp[x][y];
        }
        dp[x][y] = 1;
        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && ny >= 0 && nx < n && ny < n && arr[x][y] < arr[nx][ny]) {
                dp[x][y] = Math.max(dp[x][y], dfs(nx, ny) + 1);
                dfs(nx, ny);
            }
        }
        return dp[x][y];
    }
}
