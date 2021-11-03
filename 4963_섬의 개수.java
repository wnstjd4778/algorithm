import java.io.*;
import java.util.*;

public class Main {
    static int[][] arr;
    static int n, m;
    static boolean[][] check;
    static int[] dx = {1, 0, -1, 0, 1, 1, -1, -1};
    static int[] dy = {0, 1, 0, -1, -1, 1, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            if(n == 0 && m == 0) {
                break;
            }
            arr = new int[m][n];
            check = new boolean[m][n];
            for(int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int count = 0;
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    if(arr[i][j] == 1 && !check[i][j]) {
                        count++;
                        bfs(i, j);
                    }
                }
            }
            System.out.println(count);
        }
    }
    static class XY{
        int x;
        int y;
        XY(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static void bfs(int x, int y) {
        Queue<XY> q = new LinkedList();
        q.offer(new XY(x, y));
        while (!q.isEmpty()) {
            XY xy = q.poll();
            if(!check[xy.x][xy.y]) {
                check[xy.x][xy.y] = true;
                for(int i = 0; i < 8; i++) {
                    int nx = xy.x + dx[i];
                    int ny = xy.y + dy[i];
                    if(nx >= 0 && ny >= 0 && nx < m && ny < n && !check[nx][ny] && arr[nx][ny] == 1) {
                        q.offer(new XY(nx, ny));
                    }
                }
            }
        }
    }
}
