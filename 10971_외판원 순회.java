import java.io.*;
import java.util.*;


public class Main {
    static int n, min = Integer.MAX_VALUE;
    static int[][] arr;
    static boolean[] check;
    static final int INF = 999999999;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            StringTokenizer st= new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == 0) {
                    arr[i][j] = INF;
                }
            }
        }
        for(int i = 0; i < n; i++) {
            check = new boolean[n];
            check[i] = true;
            dfs(i, i, 0, 0);
        }
        System.out.println(min);

    }
    public static void dfs(int start, int end, int depth, int sum) {
        if(depth == n - 1) {
            min = Math.min(min, sum + arr[start][end]);
            return;
        }
        for(int i = 0; i < n; i++) {
            if(!check[i]) {
                check[i] = true;
                dfs(i, end,depth + 1, sum + arr[start][i]);
                check[i] = false;
            }
        }
    }

}
