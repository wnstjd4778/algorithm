import java.io.*;
import java.util.*;


public class Main {
    static int n, cnt;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n + 2][n + 2];
        for(int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= n; j++) {
                int a = Integer.parseInt(st.nextToken());
                if(a == 0) {
                    arr[i][j] = 2;
                } else {
                    arr[i][j] = a;
                }
            }
        }
        arr[1][1]=5; arr[1][2]=5; // 처음 파이프는 가로로 누워있다.

        cnt = 0;
        int x = 1; int y = 2; // 가로의 오른쪽칸에서 출발

        dfs(x,y);
        System.out.println(cnt);
    }
    public static void dfs(int x, int y) {
        if(x == n && y == n) {
            cnt++;
            return;
        }
        if(arr[x - 1][y] == 5) {
            if(arr[x + 1][y] == 2) {
                arr[x - 1][y] = 2;
                arr[x + 1][y] = 5;
                dfs(x + 1, y);
                arr[x - 1][y] = 5;
                arr[x + 1][y] = 2;
            }
            if(arr[x + 1][y + 1] == 2 && arr[x + 1][y] != 1 && arr[x][y + 1] != 1) {
                arr[x - 1][y] = 2;
                arr[x + 1][y + 1] = 5;
                dfs(x + 1, y + 1);
                arr[x - 1][y] = 5;
                arr[x + 1][y + 1] = 2;
            }
        }
        else if(arr[x][y - 1] == 5) {
            if(arr[x][y + 1] == 2) {
                arr[x][y - 1] = 2;
                arr[x][y + 1] = 5;
                dfs(x, y + 1);
                arr[x][y - 1] = 5;
                arr[x][y - 1] = 2;
            }
            if(arr[x + 1][y + 1] == 2 && arr[x + 1][y] != 1 && arr[x][y + 1] != 1) {
                arr[x][y - 1] = 2;
                arr[x + 1][y + 1] = 5;
                dfs(x + 1, y + 1);
                arr[x][y - 1] = 5;
                arr[x + 1][y + 1] = 2;
            }
        }
        else if(arr[x - 1][y - 1] == 5) {
            if(arr[x][y + 1] == 2) {
                arr[x - 1][y - 1] = 2;
                arr[x][y + 1] = 5;
                dfs(x, y + 1);
                arr[x - 1][y - 1] = 5;
                arr[x][y - 1] = 2;
            }
            if(arr[x + 1][y + 1] == 2 && arr[x + 1][y] != 1 && arr[x][y + 1] != 1) {
                arr[x - 1][y - 1] = 2;
                arr[x + 1][y + 1] = 5;
                dfs(x + 1, y + 1);
                arr[x - 1][y - 1] = 5;
                arr[x + 1][y + 1] = 2;
            }
            if(arr[x + 1][y] == 2) {
                arr[x - 1][y - 1] = 2;
                arr[x + 1][y] = 5;
                dfs(x + 1, y);
                arr[x - 1][y - 1] = 5;
                arr[x + 1][y] = 2;
            }
        }
    }
}
