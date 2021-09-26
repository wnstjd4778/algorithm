import java.io.*;
import java.util.*;


public class Main {
    static int n, count, max, countMax;
    static int[][] arr;
    static boolean[][] check;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, arr[i][j]);
            }
        }
        for(int k = 0; k <= max; k++) {
            count = 0;
            check = new boolean[n][n];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    if(!check[i][j] && arr[i][j] > k) {
                        bfs(i, j, k);
                        count++;
                    }
                }
            }
            countMax = Math.max(countMax, count);
        }
        System.out.println(countMax);
    }
    public static void bfs(int x, int y, int size) {
        Queue<XY> queue = new LinkedList<>();
        queue.offer(new XY(x, y));
        check[x][y] = true;
        while (!queue.isEmpty()) {
            XY xy = queue.poll();
            for(int i = 0; i < 4; i++) {
                int nx = xy.x + dx[i];
                int ny = xy.y + dy[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny < n && !check[nx][ny] && arr[nx][ny] > size) {
                    queue.offer(new XY(nx, ny));
                    check[nx][ny] = true;
                }
            }
        }
    }
    public static class XY{
        int x,y;
        XY(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
