import java.io.*;
import java.util.*;


public class Main {
    static int n, m, max;
    static int[][] arr;
    static boolean[][] check;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        check = new boolean[n][m];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                check[i][j] = true;
                dfs(i, j, 1, arr[i][j]);
                check[i][j] = false;
            }
        }
        System.out.println(max);
    }
    public static void dfs(int x, int y, int depth, int sum) {
        if(depth == 4) {
            max = Math.max(max, sum);
            return;
        }
        // ㅓㅏㅗㅜ 만들기
        if(depth == 3) {
            if(y >= 2 && y < m) {
                if (check[x][y - 1] && check[x][y - 2]) {
                    if(x + 1 < n) {
                        dfs(x, y, depth + 1, sum + arr[x + 1][y - 1]);
                    }
                    if(x - 1 >= 0) {
                        dfs(x, y, depth + 1, sum + arr[x - 1][y - 1]);
                    }
                }
            }
            if(x >= 2 && x < n) {
                if (check[x - 1][y] && check[x - 2][y]) {
                    if(y >= 1) {
                        dfs(x, y, depth + 1, sum + arr[x - 1][y - 1]);
                    }
                    if(y + 1 < m) {
                        dfs(x, y, depth + 1, sum + arr[x - 1][y + 1]);
                    }
                }
            }
        }
        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < n && ny >= 0 && ny < m && !check[nx][ny]) {
                check[nx][ny] = true;
                dfs(nx, ny, depth + 1, sum + arr[nx][ny]);
                check[nx][ny] = false;
            }
        }
    }
}
