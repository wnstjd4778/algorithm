import java.io.*;
import java.util.*;


public class Main {
    static int n, l, r, count, sum, count1, count2;
    static int[][] arr;
    static boolean[][] check;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        arr = new int[n + 1][n + 1];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        while (true) {
            check = new boolean[n + 1][n + 1];
            check();
            if(count1 == 0) {
                break;
            }
            count1 = 0;
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    if(check[i][j]) {
                        sum = 0;
                        count = 0;
                        bfs(i, j);
                    }
                }
            }
            count2++;
        }
        
        System.out.println(count2);
    }
    public static void bfs(int x, int y) {
        Queue<XY> queue = new LinkedList<>();
        queue.offer(new XY(x, y));
        boolean[][] check1 = new boolean[n][n];
        check1[x][y] = true;
        sum += arr[x][y];
        check[x][y] = false;
        count++;
        while (!queue.isEmpty()) {
            XY xy = queue.poll();
            for(int i = 0; i < 4; i++) {
                int nx = xy.x + dx[i];
                int ny = xy.y + dy[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny < n && check[nx][ny] && !check1[nx][ny]) {
                    if(Math.abs(arr[nx][ny] - arr[xy.x][xy.y]) >= l && Math.abs(arr[nx][ny] - arr[xy.x][xy.y]) <= r) {
                        check[nx][ny] = false;
                        sum += arr[nx][ny];
                        count++;
                        check1[nx][ny] = true;
                        queue.offer(new XY(nx, ny));
                    }
                }
            }
        }
        int num = sum / count;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(check1[i][j]) {
                    arr[i][j] = num;
                }
            }
        }
    }
    public static void check() {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(j + 1 < n) {
                    if (Math.abs(arr[i][j] - arr[i][j + 1]) >= l && Math.abs(arr[i][j] - arr[i][j + 1]) <= r) {
                        check[i][j] = true;
                        check[i][j + 1] = true;
                        count1++;
                    }
                }
                if(i + 1 < n) {
                    if (Math.abs(arr[i][j] - arr[i + 1][j]) >= l && Math.abs(arr[i][j] - arr[i + 1][j]) <= r) {
                        check[i][j] = true;
                        check[i + 1][j] = true;
                        count1++;
                    }
                }
            }
        }
    }
    static class XY{
        int x, y;
        XY(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
