import java.io.*;
import java.util.*;


public class Main {
    static int n, count1, count2;
    static char[][] arr;
    static boolean[][] check;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0 , -1, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new char[n][n];
        check = new boolean[n][n];
        for(int i = 0; i < n; i++) {
            String a = br.readLine();
            for(int j = 0; j < n; j++) {
                arr[i][j] = a.charAt(j);
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(!check[i][j]) {
                    dfs(i, j);
                    count1++;
                }
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[i][j] == 'R') {
                    arr[i][j] = 'G';
                }
            }
        }
        check = new boolean[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(!check[i][j]) {
                    dfs(i, j);
                    count2++;
                }
            }
        }
        System.out.println(count1);
        System.out.println(count2);
    }

    public static void dfs(int x, int y) {
        check[x][y] = true;
        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < n && ny >= 0 && ny < n && !check[nx][ny] && arr[x][y] == arr[nx][ny]) {
                dfs(nx, ny);
            }
        }
    }
}
