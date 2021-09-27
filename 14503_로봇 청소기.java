import java.io.*;
import java.util.*;


public class Main {

    static int n, m, x, y, count, d;
    static int[][] arr;
    static boolean[][] check;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        check = new boolean[n][m];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(x, y, d);
        System.out.println(count);
    }

    public static void dfs(int x, int y, int d) {
        boolean sign = false;
        if(!check[x][y]) {
            check[x][y] = true;
            count++;
        }
        for(int i = 0; i < 4; i++) {
             d = direction(d);
             int nx = x + dx[d];
             int ny = y + dy[d];
             if(arr[nx][ny] == 0 && !check[nx][ny]) {
                 dfs(nx, ny, d);
                 sign = true;
                 break;
             }
        }
        if(sign == false) {
            int nx = x - dx[d];
            int ny = y - dy[d];

            if(arr[nx][ny] == 0) {
                dfs(nx, ny, d);
            }
        }
    }

    public static int direction(int d) {
        if(d == 0){
            return 3;
        } else if(d == 1) {
            return 0;
        } else if(d == 2) {
            return 1;
        } else {
            return 2;
        }
    }
}
