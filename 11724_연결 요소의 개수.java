import java.io.*;
import java.util.*;


public class Main {

    static int n, m, count;
    static boolean[][] map;
    static boolean[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new boolean[n + 1][n + 1];
        check = new boolean[n + 1];
        count = 0;
        for(int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            map[start][end] = true;
            map[end][start] = true;
        }
        for(int i = 1; i <= n; i++) {
            if(!check[i]) {
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
    }

    public static void dfs(int start) {
        check[start] = true;
        for(int i = 1; i <= n; i++) {
            if(map[start][i] && !check[i]) {
                dfs(i);
            }
        }
    }
}
