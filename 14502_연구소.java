import java.io.*;
import java.util.*;


public class Main {

    static int n, m, max, count;
    static boolean[][] visited;
    static boolean[][] check;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        visited = new boolean[n][m];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0, arr);
        System.out.println(max);
    }
    public static void bfs(int x, int y, int[][] arr) {
        Queue<XY> queue = new LinkedList<>();
        queue.offer(new XY(x, y));
        check[x][y] = true;
        while (!queue.isEmpty()) {
            XY xy = queue.poll();
            for(int i = 0; i < 4; i++) {
                int nx = xy.x + dx[i];
                int ny = xy.y + dy[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny < m && !check[nx][ny] && arr[nx][ny] == 0) {
                    queue.offer(new XY(nx, ny));
                    check[nx][ny] = true;
                }
            }
        }
    }
    public static void dfs(int depth, int[][] arr) {
        if(depth == 3) {
            count = 0;
            check = new boolean[n][m];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    if(!check[i][j] && arr[i][j] == 2) {
                        bfs(i, j, arr);
                    }
                }
            }

            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    if(!check[i][j] && arr[i][j] == 0) {
                        count++;
                    }
                }
            }
            max = Math.max(max, count);
            return;
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(arr[i][j] == 0) {
                    arr[i][j] = 1;
                    dfs(depth + 1, arr);
                    arr[i][j] = 0;
                }
            }
        }
    }
    static class XY {
        int x, y;
        XY(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
